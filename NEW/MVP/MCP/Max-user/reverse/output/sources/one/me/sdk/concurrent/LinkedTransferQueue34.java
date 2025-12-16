package one.me.sdk.concurrent;

import androidx.annotation.Keep;
import defpackage.a06;
import defpackage.gb3;
import defpackage.u88;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.locks.LockSupport;
import java.util.function.Consumer;
import java.util.function.Predicate;

@Keep
/* loaded from: classes2.dex */
public class LinkedTransferQueue34<E> extends AbstractQueue<E> implements TransferQueue<E>, Serializable {
    private static final int ASYNC = 1;
    private static final VarHandle HEAD;
    static final VarHandle ITEM;
    private static final int MAX_HOPS = 8;
    static final VarHandle NEXT;
    private static final int NOW = 0;
    static final long SPIN_FOR_TIMEOUT_THRESHOLD = 1023;
    static final int SWEEP_THRESHOLD = 32;
    private static final int SYNC = 2;
    private static final VarHandle TAIL;
    private static final int TIMED = 3;
    static final VarHandle WAITER;
    private static final long serialVersionUID = -3223113410248163686L;
    volatile transient Node head;
    private volatile transient boolean needSweep;
    private volatile transient Node tail;

    static {
        try {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            HEAD = lookup.findVarHandle(LinkedTransferQueue34.class, "head", Node.class);
            TAIL = lookup.findVarHandle(LinkedTransferQueue34.class, "tail", Node.class);
            ITEM = lookup.findVarHandle(Node.class, "item", Object.class);
            NEXT = lookup.findVarHandle(Node.class, "next", Node.class);
            WAITER = lookup.findVarHandle(Node.class, "waiter", Thread.class);
        } catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public LinkedTransferQueue34() {
        Node node = new Node();
        this.tail = node;
        this.head = node;
    }

    private E awaitMatch(Node node, Node node2, E e, boolean z, long j) throws InterruptedException {
        E e2;
        boolean z2 = node.isData;
        long jNanoTime = z ? System.nanoTime() + j : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        char c = 65535;
        long jNanoTime2 = j;
        while (true) {
            e2 = (E) node.item;
            if (e2 != e) {
                break;
            }
            if (this.needSweep) {
                sweep();
            } else if ((z && jNanoTime2 <= 0) || threadCurrentThread.isInterrupted()) {
                if (node.casItem(e, e == null ? node : null)) {
                    unsplice(node2, node);
                    return e;
                }
            } else if (c > 0) {
                e2 = (E) node.item;
                if (e2 != e) {
                    break;
                }
                if (z) {
                    jNanoTime2 = jNanoTime - System.nanoTime();
                    if (jNanoTime2 > SPIN_FOR_TIMEOUT_THRESHOLD) {
                        LockSupport.parkNanos(this, jNanoTime2);
                    }
                } else {
                    LockSupport.setCurrentBlocker(this);
                    try {
                        ForkJoinPool.managedBlock(node);
                    } catch (InterruptedException unused) {
                    }
                    LockSupport.setCurrentBlocker(null);
                }
            } else if (node2 != null && node2.next == node) {
                if (c >= 0 || (node2.isData == z2 && !node2.isMatched())) {
                    node.waiter = threadCurrentThread;
                    c = 1;
                } else {
                    Thread.yield();
                    c = 0;
                }
            }
        }
        if (c == 1) {
            (void) WAITER.set(node, null);
        }
        if (!z2) {
            (void) ITEM.set(node, node);
        }
        return e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean bulkRemove(java.util.function.Predicate<? super E> r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = r0
        L2:
            one.me.sdk.concurrent.LinkedTransferQueue34$Node r2 = r13.head
            r3 = 0
            r4 = 8
            r5 = r2
            r7 = r3
            r6 = r4
        La:
            if (r2 == 0) goto L4e
            one.me.sdk.concurrent.LinkedTransferQueue34$Node r8 = r2.next
            java.lang.Object r9 = r2.item
            r10 = 1
            if (r9 == 0) goto L19
            boolean r11 = r2.isData
            if (r11 == 0) goto L19
            r11 = r10
            goto L1a
        L19:
            r11 = r0
        L1a:
            if (r11 == 0) goto L2b
            boolean r12 = r14.test(r9)
            if (r12 == 0) goto L32
            boolean r9 = r2.tryMatch(r9, r3)
            if (r9 == 0) goto L29
            r1 = r10
        L29:
            r11 = r0
            goto L32
        L2b:
            boolean r10 = r2.isData
            if (r10 != 0) goto L32
            if (r9 != 0) goto L32
            goto L4e
        L32:
            if (r11 != 0) goto L3e
            if (r8 == 0) goto L3e
            int r6 = r6 + (-1)
            if (r6 != 0) goto L3b
            goto L3e
        L3b:
            if (r2 != r8) goto L4c
            goto L2
        L3e:
            if (r5 == r2) goto L47
            boolean r5 = r13.tryCasSuccessor(r7, r5, r2)
            if (r5 == 0) goto L49
            r5 = r2
        L47:
            if (r11 == 0) goto L4c
        L49:
            r7 = r2
            r6 = r4
            r5 = r8
        L4c:
            r2 = r8
            goto La
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.concurrent.LinkedTransferQueue34.bulkRemove(java.util.function.Predicate):boolean");
    }

    private boolean casHead(Node node, Node node2) {
        return (boolean) HEAD.compareAndSet(this, node, node2);
    }

    private boolean casTail(Node node, Node node2) {
        return (boolean) TAIL.compareAndSet(this, node, node2);
    }

    private int countOfMode(boolean z) {
        while (true) {
            Node node = this.head;
            int i = 0;
            while (node != null) {
                if (!node.isMatched()) {
                    if (node.isData != z) {
                        return 0;
                    }
                    i++;
                    if (i == Integer.MAX_VALUE) {
                        return i;
                    }
                }
                Node node2 = node.next;
                if (node == node2) {
                    break;
                }
                node = node2;
            }
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$clear$2(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$retainAll$1(Collection collection, Object obj) {
        return !collection.contains(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Node node = null;
        Node node2 = null;
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                break;
            }
            Node node3 = new Node(object);
            if (node == null) {
                node = node3;
            } else {
                node2.appendRelaxed(node3);
            }
            node2 = node3;
        }
        if (node == null) {
            node = new Node();
            node2 = node;
        }
        this.head = node;
        this.tail = node2;
    }

    private Node skipDeadNodes(Node node, Node node2, Node node3, Node node4) {
        if (node4 != null) {
            if (tryCasSuccessor(node, node2, node4) || (node != null && node.isMatched())) {
                return node3;
            }
        } else if (node2 != node3) {
            node4 = node3;
            if (tryCasSuccessor(node, node2, node4)) {
            }
            return node3;
        }
        return node;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
    
        r3.selfLink();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        if (casHead(r3, r4) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void skipDeadNodesNearHead(one.me.sdk.concurrent.LinkedTransferQueue34.Node r3, one.me.sdk.concurrent.LinkedTransferQueue34.Node r4) {
        /*
            r2 = this;
        L0:
            one.me.sdk.concurrent.LinkedTransferQueue34$Node r0 = r4.next
            if (r0 != 0) goto L5
            goto Lc
        L5:
            boolean r1 = r0.isMatched()
            if (r1 != 0) goto L16
            r4 = r0
        Lc:
            boolean r4 = r2.casHead(r3, r4)
            if (r4 == 0) goto L18
            r3.selfLink()
            return
        L16:
            if (r4 != r0) goto L19
        L18:
            return
        L19:
            r4 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.concurrent.LinkedTransferQueue34.skipDeadNodesNearHead(one.me.sdk.concurrent.LinkedTransferQueue34$Node, one.me.sdk.concurrent.LinkedTransferQueue34$Node):void");
    }

    private void sweep() {
        this.needSweep = false;
        Node node = this.head;
        while (node != null) {
            Node node2 = node.next;
            if (node2 == null) {
                return;
            }
            if (node2.isMatched()) {
                Node node3 = node2.next;
                if (node3 == null) {
                    return;
                }
                if (node2 == node3) {
                    node = this.head;
                } else {
                    node.casNext(node2, node3);
                }
            } else {
                node = node2;
            }
        }
    }

    private Object[] toArrayInternal(Object[] objArr) {
        int i;
        Object[] objArrCopyOf = objArr;
        loop0: while (true) {
            Node node = this.head;
            i = 0;
            while (node != null) {
                Object obj = node.item;
                if (!node.isData) {
                    if (obj == null) {
                        break loop0;
                    }
                } else if (obj != null) {
                    if (objArrCopyOf == null) {
                        objArrCopyOf = new Object[4];
                    } else if (i == objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, (i + 4) * 2);
                    }
                    objArrCopyOf[i] = obj;
                    i++;
                }
                Node node2 = node.next;
                if (node == node2) {
                    break;
                }
                node = node2;
            }
        }
        if (objArrCopyOf == null) {
            return new Object[0];
        }
        if (objArr == null || i > objArr.length) {
            return i == objArrCopyOf.length ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i);
        }
        if (objArr != objArrCopyOf) {
            System.arraycopy(objArrCopyOf, 0, objArr, 0, i);
        }
        if (i < objArr.length) {
            objArr[i] = null;
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tryCasSuccessor(Node node, Node node2, Node node3) {
        if (node != null) {
            return node.casNext(node2, node3);
        }
        if (!casHead(node2, node3)) {
            return false;
        }
        node2.selfLink();
        return true;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeObject(null);
    }

    private E xfer(E e, boolean z, int i, long j) {
        Node node;
        Node node2;
        Node node3;
        boolean z2;
        E e2;
        long j2;
        Node node4;
        LinkedTransferQueue34<E> linkedTransferQueue34;
        if (z) {
            e.getClass();
        }
        Node node5 = null;
        Node node6 = null;
        Node node7 = null;
        loop0: while (true) {
            Node node8 = this.tail;
            if (node5 == node8 || node8.isData != z) {
                node = this.head;
                node2 = node;
            } else {
                node2 = node6;
                node = node8;
            }
            do {
                node3 = node;
                while (true) {
                    if (node3.isData != z) {
                        E e3 = (E) node3.item;
                        if (z == (e3 == null)) {
                            if (node2 == null) {
                                node2 = this.head;
                            }
                            if (node3.tryMatch(e3, e)) {
                                if (node2 != node3) {
                                    skipDeadNodesNearHead(node2, node3);
                                }
                                return e3;
                            }
                        }
                    }
                    node = node3.next;
                    if (node != null) {
                        break;
                    }
                    if (i == 0) {
                        break loop0;
                    }
                    if (node7 == null) {
                        node7 = new Node(e);
                    }
                    if (node3.casNext(null, node7)) {
                        if (node3 != node8) {
                            casTail(node8, node7);
                        }
                        if (i != 1) {
                            if (i == 3) {
                                z2 = true;
                                linkedTransferQueue34 = this;
                                e2 = e;
                                j2 = j;
                                node4 = node7;
                            } else {
                                z2 = false;
                                e2 = e;
                                j2 = j;
                                node4 = node7;
                                linkedTransferQueue34 = this;
                            }
                            return linkedTransferQueue34.awaitMatch(node4, node3, e2, z2, j2);
                        }
                    }
                }
            } while (node3 != node);
            node6 = node2;
            node5 = node8;
        }
        return e;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean add(E e) {
        xfer(e, true, 1, 0L);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        bulkRemove(new gb3(22));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        loop0: while (true) {
            Node node = this.head;
            Node nodeSkipDeadNodes = null;
            while (node != null) {
                Node node2 = node.next;
                Object obj2 = node.item;
                if (obj2 == null) {
                    if (!node.isData) {
                        break loop0;
                    }
                } else {
                    if (node.isData) {
                        if (obj.equals(obj2)) {
                            return true;
                        }
                        nodeSkipDeadNodes = node;
                    }
                    node = node2;
                }
                Node node3 = node;
                while (node2 != null && node2.isMatched()) {
                    if (node3 == node2) {
                        break;
                    }
                    node3 = node2;
                    node2 = node2.next;
                }
                nodeSkipDeadNodes = skipDeadNodes(nodeSkipDeadNodes, node, node3, node2);
                node = node2;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        Objects.requireNonNull(collection);
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        int i = 0;
        while (true) {
            E ePoll = poll();
            if (ePoll == null) {
                return i;
            }
            collection.add(ePoll);
            i++;
        }
    }

    public final Node firstDataNode() {
        Node node;
        Node node2;
        Node node3;
        loop0: while (true) {
            node = this.head;
            node2 = node;
            while (node2 != null) {
                if (node2.item == null) {
                    if (!node2.isData) {
                        break loop0;
                    }
                    break loop0;
                    break loop0;
                }
                if (node2.isData) {
                    node3 = node2;
                    break loop0;
                }
                Node node4 = node2.next;
                if (node4 == null) {
                    break loop0;
                }
                if (node2 == node4) {
                    break;
                }
                node2 = node4;
            }
        }
        node3 = null;
        if (node2 != node && casHead(node, node2)) {
            node.selfLink();
        }
        return node3;
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer<? super E> consumer) {
        Objects.requireNonNull(consumer);
        forEachFrom(consumer, this.head);
    }

    public void forEachFrom(Consumer<? super E> consumer, Node node) {
        while (true) {
            Node node2 = null;
            while (node != null) {
                Node node3 = node.next;
                a06 a06Var = (Object) node.item;
                if (a06Var != null) {
                    if (node.isData) {
                        consumer.accept(a06Var);
                    }
                    node2 = node;
                    node = node3;
                } else if (!node.isData) {
                    return;
                }
                Node node4 = node;
                while (node3 != null && node3.isMatched()) {
                    if (node4 == node3) {
                        break;
                    }
                    node4 = node3;
                    node3 = node3.next;
                }
                node = skipDeadNodes(node2, node, node4, node3);
                node2 = node;
                node = node3;
            }
            return;
            node = this.head;
        }
    }

    @Override // java.util.concurrent.TransferQueue
    public int getWaitingConsumerCount() {
        return countOfMode(false);
    }

    @Override // java.util.concurrent.TransferQueue
    public boolean hasWaitingConsumer() {
        while (true) {
            Node node = this.head;
            while (node != null) {
                Object obj = node.item;
                if (node.isData) {
                    if (obj != null) {
                        return false;
                    }
                } else if (obj == null) {
                    return true;
                }
                Node node2 = node.next;
                if (node == node2) {
                    break;
                }
                node = node2;
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return firstDataNode() == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new b(this);
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e, long j, TimeUnit timeUnit) {
        xfer(e, true, 1, 0L);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        while (true) {
            Node node = this.head;
            while (node != null) {
                E e = (E) node.item;
                if (node.isData) {
                    if (e != null) {
                        return e;
                    }
                } else if (e == null) {
                    return null;
                }
                Node node2 = node.next;
                if (node == node2) {
                    break;
                }
                node = node2;
            }
            return null;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        E eXfer = xfer(null, false, 3, timeUnit.toNanos(j));
        if (eXfer == null && Thread.interrupted()) {
            throw new InterruptedException();
        }
        return eXfer;
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e) {
        xfer(e, true, 1, 0L);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return Integer.MAX_VALUE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        loop0: while (true) {
            Node node = this.head;
            Node nodeSkipDeadNodes = null;
            while (node != null) {
                Node node2 = node.next;
                Object obj2 = node.item;
                if (obj2 == null) {
                    if (!node.isData) {
                        break loop0;
                    }
                } else {
                    if (node.isData) {
                        if (obj.equals(obj2) && node.tryMatch(obj2, null)) {
                            skipDeadNodes(nodeSkipDeadNodes, node, node, node2);
                            return true;
                        }
                        nodeSkipDeadNodes = node;
                    }
                    node = node2;
                }
                Node node3 = node;
                while (node2 != null && node2.isMatched()) {
                    if (node3 == node2) {
                        break;
                    }
                    node3 = node2;
                    node2 = node2.next;
                }
                nodeSkipDeadNodes = skipDeadNodes(nodeSkipDeadNodes, node, node3, node2);
                node = node2;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return bulkRemove(new u88(1, collection));
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        Objects.requireNonNull(predicate);
        return bulkRemove(predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return bulkRemove(new u88(0, collection));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return countOfMode(true);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator<E> spliterator() {
        return new c(this);
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        E eXfer = xfer(null, false, 2, 0L);
        if (eXfer != null) {
            return eXfer;
        }
        Thread.interrupted();
        throw new InterruptedException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return toArrayInternal(null);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        int length;
        int i;
        String[] strArr = null;
        loop0: while (true) {
            Node node = this.head;
            length = 0;
            i = 0;
            while (node != null) {
                Object obj = node.item;
                if (!node.isData) {
                    if (obj == null) {
                        break loop0;
                    }
                } else if (obj != null) {
                    if (strArr == null) {
                        strArr = new String[4];
                    } else if (i == strArr.length) {
                        strArr = (String[]) Arrays.copyOf(strArr, i * 2);
                    }
                    String string = obj.toString();
                    strArr[i] = string;
                    length += string.length();
                    i++;
                }
                Node node2 = node.next;
                if (node == node2) {
                    break;
                }
                node = node2;
            }
        }
        if (i == 0) {
            return "[]";
        }
        char[] cArr = new char[(i * 2) + length];
        cArr[0] = '[';
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 > 0) {
                int i4 = i2 + 1;
                cArr[i2] = ',';
                i2 += 2;
                cArr[i4] = ' ';
            }
            String str = strArr[i3];
            int length2 = str.length();
            str.getChars(0, length2, cArr, i2);
            i2 += length2;
        }
        cArr[i2] = ']';
        return new String(cArr);
    }

    @Override // java.util.concurrent.TransferQueue
    public void transfer(E e) throws InterruptedException {
        if (xfer(e, true, 2, 0L) == null) {
            return;
        }
        Thread.interrupted();
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.TransferQueue
    public boolean tryTransfer(E e) {
        return xfer(e, true, 0, 0L) == null;
    }

    public final void unsplice(Node node, Node node2) {
        node2.waiter = null;
        if (node == null || node.next != node2) {
            return;
        }
        Node node3 = node2.next;
        if (node3 != null && (node3 == node2 || !node.casNext(node2, node3) || !node.isMatched())) {
            return;
        }
        while (true) {
            Node node4 = this.head;
            if (node4 == node || node4 == node2) {
                return;
            }
            if (!node4.isMatched()) {
                if (node.next == node || node2.next == node2) {
                    return;
                }
                this.needSweep = true;
                return;
            }
            Node node5 = node4.next;
            if (node5 == null) {
                return;
            }
            if (node5 != node4 && casHead(node4, node5)) {
                node4.selfLink();
            }
        }
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(E e) {
        xfer(e, true, 1, 0L);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        return (T[]) toArrayInternal(tArr);
    }

    @Override // java.util.concurrent.TransferQueue
    public boolean tryTransfer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        if (xfer(e, true, 3, timeUnit.toNanos(j)) == null) {
            return true;
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return false;
    }

    @Keep
    public static final class Node implements ForkJoinPool.ManagedBlocker {
        private static final long serialVersionUID = -3375979862319811754L;
        final boolean isData;
        volatile Object item;
        volatile Node next;
        volatile Thread waiter;

        public Node(Object obj) {
            (void) LinkedTransferQueue34.ITEM.set(this, obj);
            this.isData = obj != null;
        }

        public final void appendRelaxed(Node node) {
            (void) LinkedTransferQueue34.NEXT.setOpaque(this, node);
        }

        @Override // java.util.concurrent.ForkJoinPool.ManagedBlocker
        public final boolean block() {
            while (!isReleasable()) {
                LockSupport.park();
            }
            return true;
        }

        public final boolean cannotPrecede(boolean z) {
            boolean z2 = this.isData;
            if (z2 != z) {
                if (z2 != (this.item == null)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean casItem(Object obj, Object obj2) {
            return (boolean) LinkedTransferQueue34.ITEM.compareAndSet(this, obj, obj2);
        }

        public final boolean casNext(Node node, Node node2) {
            return (boolean) LinkedTransferQueue34.NEXT.compareAndSet(this, node, node2);
        }

        public final boolean isMatched() {
            return this.isData == (this.item == null);
        }

        @Override // java.util.concurrent.ForkJoinPool.ManagedBlocker
        public final boolean isReleasable() {
            return this.isData == (this.item == null) || Thread.currentThread().isInterrupted();
        }

        public final void selfLink() {
            (void) LinkedTransferQueue34.NEXT.setRelease(this, this);
        }

        public final boolean tryMatch(Object obj, Object obj2) {
            if (!casItem(obj, obj2)) {
                return false;
            }
            LockSupport.unpark(this.waiter);
            return true;
        }

        public Node() {
            this.isData = true;
        }
    }

    public LinkedTransferQueue34(Collection<? extends E> collection) {
        Node node = null;
        Node node2 = null;
        for (E e : collection) {
            Objects.requireNonNull(e);
            Node node3 = new Node(e);
            if (node == null) {
                node = node3;
            } else {
                node2.appendRelaxed(node3);
            }
            node2 = node3;
        }
        if (node == null) {
            node = new Node();
            node2 = node;
        }
        this.head = node;
        this.tail = node2;
    }

    @Override // java.util.Queue
    public E poll() {
        return xfer(null, false, 0, 0L);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i) {
        Objects.requireNonNull(collection);
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        int i2 = 0;
        while (i2 < i) {
            E ePoll = poll();
            if (ePoll == null) {
                break;
            }
            collection.add(ePoll);
            i2++;
        }
        return i2;
    }
}

package one.me.sdk.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;
import one.me.sdk.concurrent.LinkedTransferQueue34;

/* loaded from: classes2.dex */
public final class b implements Iterator {
    public LinkedTransferQueue34.Node a;
    public Object b;
    public LinkedTransferQueue34.Node c;
    public LinkedTransferQueue34.Node d;
    public final /* synthetic */ LinkedTransferQueue34 o;

    public b(LinkedTransferQueue34 linkedTransferQueue34) {
        this.o = linkedTransferQueue34;
        a(null);
    }

    public final void a(LinkedTransferQueue34.Node node) {
        LinkedTransferQueue34.Node node2 = node == null ? this.o.head : node.next;
        LinkedTransferQueue34.Node node3 = node2;
        while (node2 != null) {
            Object obj = node2.item;
            if (obj != null && node2.isData) {
                this.a = node2;
                this.b = obj;
                if (node3 != node2) {
                    this.o.tryCasSuccessor(node, node3, node2);
                    return;
                }
                return;
            }
            if (!node2.isData && obj == null) {
                break;
            }
            if (node3 != node2) {
                if (this.o.tryCasSuccessor(node, node3, node2)) {
                    node3 = node2;
                } else {
                    node3 = node2.next;
                    node = node2;
                    node2 = node3;
                }
            }
            LinkedTransferQueue34.Node node4 = node2.next;
            if (node2 == node4) {
                node2 = this.o.head;
                node3 = node2;
                node = null;
            } else {
                node2 = node4;
            }
        }
        this.b = null;
        this.a = null;
    }

    @Override // java.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        LinkedTransferQueue34.Node node = null;
        while (true) {
            LinkedTransferQueue34.Node node2 = this.a;
            if (node2 == null) {
                break;
            }
            consumer.accept(this.b);
            a(node2);
            node = node2;
        }
        if (node != null) {
            this.c = node;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        LinkedTransferQueue34.Node node = this.a;
        if (node == null) {
            throw new NoSuchElementException();
        }
        Object obj = this.b;
        this.c = node;
        a(node);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0056 A[SYNTHETIC] */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void remove() {
        /*
            r8 = this;
            one.me.sdk.concurrent.LinkedTransferQueue34$Node r0 = r8.c
            if (r0 == 0) goto L6b
            r1 = 0
            r8.c = r1
            java.lang.Object r2 = r0.item
            if (r2 != 0) goto Ld
            goto L6a
        Ld:
            one.me.sdk.concurrent.LinkedTransferQueue34$Node r2 = r8.d
            if (r2 != 0) goto L16
            one.me.sdk.concurrent.LinkedTransferQueue34 r3 = r8.o
            one.me.sdk.concurrent.LinkedTransferQueue34$Node r3 = r3.head
            goto L18
        L16:
            one.me.sdk.concurrent.LinkedTransferQueue34$Node r3 = r2.next
        L18:
            r4 = r3
        L19:
            if (r3 == 0) goto L6a
            if (r3 != r0) goto L34
            java.lang.Object r0 = r3.item
            if (r0 == 0) goto L24
            r3.tryMatch(r0, r1)
        L24:
            one.me.sdk.concurrent.LinkedTransferQueue34$Node r0 = r3.next
            if (r0 != 0) goto L29
            goto L2a
        L29:
            r3 = r0
        L2a:
            if (r4 == r3) goto L31
            one.me.sdk.concurrent.LinkedTransferQueue34 r0 = r8.o
            one.me.sdk.concurrent.LinkedTransferQueue34.d(r0, r2, r4, r3)
        L31:
            r8.d = r2
            return
        L34:
            java.lang.Object r5 = r3.item
            if (r5 == 0) goto L3e
            boolean r6 = r3.isData
            if (r6 == 0) goto L3e
            r6 = 1
            goto L3f
        L3e:
            r6 = 0
        L3f:
            if (r6 == 0) goto L42
            goto L49
        L42:
            boolean r7 = r3.isData
            if (r7 != 0) goto L49
            if (r5 != 0) goto L49
            goto L6a
        L49:
            if (r4 == r3) goto L54
            one.me.sdk.concurrent.LinkedTransferQueue34 r5 = r8.o
            boolean r4 = one.me.sdk.concurrent.LinkedTransferQueue34.d(r5, r2, r4, r3)
            if (r4 == 0) goto L56
            r4 = r3
        L54:
            if (r6 == 0) goto L5c
        L56:
            one.me.sdk.concurrent.LinkedTransferQueue34$Node r2 = r3.next
            r4 = r2
            r2 = r3
            r3 = r4
            goto L19
        L5c:
            one.me.sdk.concurrent.LinkedTransferQueue34$Node r5 = r3.next
            if (r3 != r5) goto L68
            one.me.sdk.concurrent.LinkedTransferQueue34 r2 = r8.o
            one.me.sdk.concurrent.LinkedTransferQueue34$Node r2 = r2.head
            r3 = r2
            r4 = r3
            r2 = r1
            goto L19
        L68:
            r3 = r5
            goto L19
        L6a:
            return
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.concurrent.b.remove():void");
    }
}

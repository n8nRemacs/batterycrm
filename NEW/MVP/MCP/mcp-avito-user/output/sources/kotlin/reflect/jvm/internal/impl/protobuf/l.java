package kotlin.reflect.jvm.internal.impl.protobuf;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* loaded from: classes8.dex */
public class l extends AbstractList<String> implements RandomAccess, m {

    /* renamed from: c, reason: collision with root package name */
    public static final v f409378c = new v(new l());

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f409379b;

    public l() {
        this.f409379b = new ArrayList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public final void B2(d dVar) {
        this.f409379b.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        this.f409379b.add(i12, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f409379b.size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f409379b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        String str;
        ArrayList arrayList = this.f409379b;
        Object obj = arrayList.get(i12);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            str = dVar.y();
            if (dVar.j()) {
                arrayList.set(i12, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = i.f409374a;
            try {
                str = new String(bArr, Constants.ENCODING);
                if (w.c(bArr, 0, bArr.length) == 0) {
                    arrayList.set(i12, str);
                }
            } catch (UnsupportedEncodingException e12) {
                throw new RuntimeException("UTF-8 not supported?", e12);
            }
        }
        return str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public final d getByteString(int i12) {
        d nVar;
        ArrayList arrayList = this.f409379b;
        Object obj = arrayList.get(i12);
        if (obj instanceof d) {
            nVar = (d) obj;
        } else if (obj instanceof String) {
            nVar = d.d((String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            d dVar = d.f409332b;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            nVar = new n(bArr2);
        }
        if (nVar != obj) {
            arrayList.set(i12, nVar);
        }
        return nVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f409379b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public final v getUnmodifiableView() {
        return new v(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        Object objRemove = this.f409379b.remove(i12);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof d) {
            return ((d) objRemove).y();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = i.f409374a;
        try {
            return new String(bArr, Constants.ENCODING);
        } catch (UnsupportedEncodingException e12) {
            throw new RuntimeException("UTF-8 not supported?", e12);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        Object obj2 = this.f409379b.set(i12, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof d) {
            return ((d) obj2).y();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = i.f409374a;
        try {
            return new String(bArr, Constants.ENCODING);
        } catch (UnsupportedEncodingException e12) {
            throw new RuntimeException("UTF-8 not supported?", e12);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f409379b.size();
    }

    public l(m mVar) {
        this.f409379b = new ArrayList(mVar.size());
        addAll(mVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i12, Collection<? extends String> collection) {
        if (collection instanceof m) {
            collection = ((m) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f409379b.addAll(i12, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}

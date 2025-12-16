package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.internal.util.NotificationLite;

/* compiled from: AppendOnlyLinkedArrayList.java */
/* loaded from: classes8.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f404830a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f404831b;

    /* renamed from: c, reason: collision with root package name */
    public int f404832c;

    /* compiled from: AppendOnlyLinkedArrayList.java */
    /* renamed from: io.reactivex.rxjava3.internal.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC11520a<T> extends l41.r<T> {
    }

    public a() {
        Object[] objArr = new Object[5];
        this.f404830a = objArr;
        this.f404831b = objArr;
    }

    public final <U> boolean a(org.reactivestreams.d<? super U> dVar) {
        Object obj;
        Object[] objArr = this.f404830a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i12 = 0; i12 < 4 && (obj = objArr[i12]) != null; i12++) {
                if (obj == NotificationLite.f404825b) {
                    dVar.e();
                    return true;
                }
                if (obj instanceof NotificationLite.b) {
                    dVar.onError(((NotificationLite.b) obj).f404828b);
                    return true;
                }
                if (obj instanceof NotificationLite.c) {
                    dVar.K(((NotificationLite.c) obj).f404829b);
                } else {
                    dVar.onNext(obj);
                }
            }
            objArr = (Object[]) objArr[4];
        }
    }

    public final void b(T t12) {
        int i12 = this.f404832c;
        if (i12 == 4) {
            Object[] objArr = new Object[5];
            this.f404831b[4] = objArr;
            this.f404831b = objArr;
            i12 = 0;
        }
        this.f404831b[i12] = t12;
        this.f404832c = i12 + 1;
    }

    public final void c(InterfaceC11520a<? super T> interfaceC11520a) {
        Object obj;
        for (Object[] objArr = this.f404830a; objArr != null; objArr = (Object[]) objArr[4]) {
            for (int i12 = 0; i12 < 4 && (obj = objArr[i12]) != null; i12++) {
                if (interfaceC11520a.test(obj)) {
                    return;
                }
            }
        }
    }
}

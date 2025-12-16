package com.avito.android.photo_list_view;

import android.content.ContentResolver;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImageListInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/k;", "Lcom/avito/android/photo_list_view/h;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_list_view.k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33217k implements InterfaceC33214h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f218170a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f218171b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33220n f218172c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ContentResolver f218173d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f218174e;

    /* compiled from: ImageListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_list_view/G;", "imageList", "Lio/reactivex/rxjava3/core/E;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_list_view.k$a */
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            List list = (List) obj;
            C33217k c33217k = C33217k.this;
            return c33217k.f218174e ? new C41936b0(io.reactivex.rxjava3.core.z.X(list), new C33216j(c33217k)).H0().F() : io.reactivex.rxjava3.core.z.c0(list);
        }
    }

    public C33217k(@Y61.k String str, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC33220n interfaceC33220n, @Y61.k ContentResolver contentResolver, boolean z12) {
        this.f218170a = str;
        this.f218171b = interfaceC35745a5;
        this.f218172c = interfaceC33220n;
        this.f218173d = contentResolver;
        this.f218174e = z12;
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33214h
    @Y61.k
    public final io.reactivex.rxjava3.core.z<List<G>> a() {
        return this.f218172c.a(this.f218170a).T(new a(), Integer.MAX_VALUE).x0(this.f218171b.a());
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33214h
    public final void b(int i12, int i13) {
        this.f218172c.c(i12, i13, this.f218170a);
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33214h
    public final void remove(@Y61.k String str) {
        this.f218172c.b(str);
    }

    public /* synthetic */ C33217k(String str, InterfaceC35745a5 interfaceC35745a5, InterfaceC33220n interfaceC33220n, ContentResolver contentResolver, boolean z12, int i12, C42822w c42822w) {
        this(str, interfaceC35745a5, interfaceC33220n, contentResolver, (i12 & 16) != 0 ? false : z12);
    }
}

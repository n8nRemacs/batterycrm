package com.avito.android.photo_list_view;

import com.avito.android.photo_list_view.y;
import kotlin.Metadata;

/* compiled from: ImageListPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/s;", "Lcom/avito/android/photo_list_view/y$a;", "a", "b", "_avito_photo-list-view_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface s extends y.a {

    /* compiled from: ImageListPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/s$a;", "", "_avito_photo-list-view_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void P3(@Y61.k G g12);
    }

    /* compiled from: ImageListPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/s$b;", "", "_avito_photo-list-view_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ImageListPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }

        void a(@Y61.l String str);
    }

    void A(@Y61.k y yVar);

    int C();

    void c(int i12);

    void e0();

    void l(boolean z12);

    void p(boolean z12);

    @Y61.k
    io.reactivex.rxjava3.core.z<G> w();

    void x(boolean z12);
}

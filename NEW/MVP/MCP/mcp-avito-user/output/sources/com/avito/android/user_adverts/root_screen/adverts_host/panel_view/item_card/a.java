package com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card;

import androidx.appcompat.app.r;
import com.avito.android.remote.model.Image;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PanelCardIcon.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/a;", "", "a", "b", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/a$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/a$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: PanelCardIcon.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/a$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.a$a, reason: collision with other inner class name */
    public static final /* data */ class C9655a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f313701a;

        public C9655a(@InterfaceC42165v int i12) {
            this.f313701a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9655a) && this.f313701a == ((C9655a) obj).f313701a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f313701a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("Drawable(drawableRes="), this.f313701a, ')');
        }
    }

    /* compiled from: PanelCardIcon.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/a$b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Image f313702a;

        public b(@Y61.l Image image) {
            this.f313702a = image;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f313702a, ((b) obj).f313702a);
        }

        public final int hashCode() {
            Image image = this.f313702a;
            if (image == null) {
                return 0;
            }
            return image.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.o(new StringBuilder("RemoteImage(image="), this.f313702a, ')');
        }
    }
}

package com.avito.android.gig_slot_show_qr.ui.screens;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.gig_slot_show_qr.mvi.o;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: GigSlotShowQrScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final h f160967a = new h();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f160968b = new C22096n(745093411, a.f160969l, false);

    /* compiled from: GigSlotShowQrScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f160969l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                C42784z0 c42784z0 = C42784z0.f406748b;
                n.a(new o.a(new AttributedText("Если возникнут сложности, обратитесь к сотруднику магазина", c42784z0, 0, 4, null), "Отметьтесь через терминал в магазине", C42745f0.U(new AttributedText("Нажмите на терминале «Начало работы» и отсканируйте QR-код", c42784z0, 0, 4, null), new AttributedText("Покажите лицо на камеру терминала", c42784z0, 0, 4, null), new AttributedText("Можете приступать к задачам. Смена в приложении скоро запустится", c42784z0, 0, 4, null)), new NoMatchLink(), "iVBORw0KGgoAAAANSUhEUgAAAQAAAAEAAQMAAABmvDolAAAABlBMVEX///8AAABVwtN+AAABm0lEQVR42uyYQY6lMAxEK2LBkiNwFI6WHC1H4Qi9zCJKjcoG+iP92Y4GCy+6hf/bxHbsivHaa6/9t7ZQ1rAxsS07MtvpCgXsAKaGrci7A6mdrljAxjG1pUJ/WTFOV0wgA7NCgdAAyQ5go2o7ImAlvNScun/ga9k/HfCGZMD8s9acvjexhwMXVwQAGH8bPI8GVMI2ccqwj+KhGc8CsLL4McdEZdNSWX6LNgpQ7W7KZz8lKqepIxaATeVKn5s7soWGH3EIAch3yAPM3CWGFAd2hAKwujCoWb615mEiIbGFAjQkk86e1aPoA6XeOm0EQJeXXT2KfSYrUvNCjwZY312qx4Ecmp75Qx6EAOyJqUPn5Nd2CCv3HhUBuKS7rB4VkDqCAf6vwjOcE39cUoQDaIsR2MRhOiLSngT8vkPOfqQWdNMPEYBro+XKVoCp+Y5YwPFqtneWb7QUhxQOuDZaHhSr6nJ/qcUC7NWsFlTxKfZCAdmkO4795Jd0Pxw4t81jsrnp6Q4HHBst0i7vVsasdA/EAl577bV/bn8CAAD//9/bvPW+lrphAAAAAElFTkSuQmCC"), f.f160965l, g.f160966l, a13, 432);
            }
            return G0.f406611a;
        }
    }
}

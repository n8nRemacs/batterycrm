package x4;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.autoteka.teaser.d;
import com.avito.android.advert.item.autoteka.teaser.e;
import com.avito.android.advert.item.teaser.a;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.autotekateaser.AutotekaReportLink;
import com.avito.android.remote.model.autotekateaser.CpoDescription;
import com.avito.android.remote.model.teaser.TeaserError;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.I;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAutotekaTeaserViewCommon.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lx4/c;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/teaser/a;", "Lcom/avito/android/advert/item/autoteka/teaser/d;", "a", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class c extends com.avito.konveyor.adapter.b implements com.avito.android.advert.item.teaser.a, d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f442187b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final a f442188c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.teaser.c f442189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f442190e;

    /* compiled from: AdvertDetailsAutotekaTeaserViewCommon.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx4/c$a;", "Lcom/avito/android/advert/item/teaser/a$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends a.b {

        /* compiled from: AdvertDetailsAutotekaTeaserViewCommon.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: x4.c$a$a, reason: collision with other inner class name */
        public static final class C12842a {
        }

        void g0(@k FromBlock fromBlock, @k AutotekaReportLink autotekaReportLink);

        void i0(@k DeepLink deepLink);

        void k(@k CpoDescription cpoDescription);
    }

    /* compiled from: AdvertDetailsAutotekaTeaserViewCommon.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx4/c$b;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void O();
    }

    public c(@k View view, @l a aVar, @k com.avito.android.advert.item.teaser.c cVar) {
        super(view);
        this.f442187b = view;
        this.f442188c = aVar;
        this.f442189d = cVar;
        this.f442190e = new e(view, aVar);
    }

    public final void B80(@I int i12, @k List list) {
        this.f442189d.D0(i12, list);
    }

    public final void DW(@k String str) {
        I5.a(this.f442189d.f80532f, str, false);
    }

    @Override // com.avito.android.advert.item.teaser.a
    public final void R1(@k String str) {
        this.f442189d.R1(str);
    }

    public final void R70(@k String str, @l String str2) {
        Button button = this.f442189d.f80534h;
        button.setText(str);
        if (str2 == null) {
            str2 = "";
        }
        button.setSubtitle(str2);
        D6.H(button);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f442189d.getClass();
    }

    public final void jL() {
        this.f442189d.jL();
    }

    public final void w9(@k TeaserError teaserError) {
        this.f442189d.w9(teaserError);
    }
}

package androidx.compose.ui.text.platform;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.emoji2.text.e;
import kotlin.Metadata;

/* compiled from: EmojiCompatStatus.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/platform/t;", "Landroidx/compose/ui/text/platform/w;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class t implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public I3<Boolean> f42607a;

    /* compiled from: EmojiCompatStatus.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/text/platform/t$a", "Landroidx/emoji2/text/e$g;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends e.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f42608b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f42609c;

        public a(InterfaceC22204y1<Boolean> interfaceC22204y1, t tVar) {
            this.f42608b = interfaceC22204y1;
            this.f42609c = tVar;
        }

        @Override // androidx.emoji2.text.e.g
        public final void a() {
            this.f42609c.f42607a = x.f42613a;
        }

        @Override // androidx.emoji2.text.e.g
        public final void b() {
            ((C22082i3) this.f42608b).setValue(Boolean.TRUE);
            this.f42609c.f42607a = new y(true);
        }
    }

    public t() {
        this.f42607a = androidx.emoji2.text.e.g() ? a() : null;
    }

    public final I3<Boolean> a() {
        androidx.emoji2.text.e eVarA = androidx.emoji2.text.e.a();
        if (eVarA.d() == 1) {
            return new y(true);
        }
        InterfaceC22204y1 interfaceC22204y1G = C22126m3.g(Boolean.FALSE);
        eVarA.k(new a(interfaceC22204y1G, this));
        return interfaceC22204y1G;
    }
}

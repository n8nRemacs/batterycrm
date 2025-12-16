package com.avito.android.installments.form.loader;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.Loader;
import com.avito.android.imv_similiar_adverts.h;
import com.avito.android.lib.design.circular_counter.CircularCounter;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.util.I5;
import java.io.Serializable;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlin.time.g;

/* compiled from: FormLoader.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/installments/form/loader/c;", "", "a", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final long f172705g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f172706h;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f172707a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public Y41.a<G0> f172708b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.android.installments.form.loader.d f172709c;

    /* renamed from: d, reason: collision with root package name */
    public long f172710d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public CircularCounter f172711e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C42670a f172712f;

    /* compiled from: FormLoader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Lcom/avito/android/installments/form/loader/c$a;", "", "<init>", "()V", "Lkotlin/time/e;", "DEFAULT_TIMER_DURATION", "J", "TIMER_TICK_DURATION", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FormLoader.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<View> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return c.this.f172707a;
        }
    }

    /* compiled from: FormLoader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.installments.form.loader.c$c, reason: collision with other inner class name */
    public static final class C5091c extends N implements Y41.l<View, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Loader f172715m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5091c(Loader loader) {
            super(1);
            this.f172715m = loader;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            c.this.f172711e = (CircularCounter) view2.findViewById(R.id.timer_loader);
            TextView textView = (TextView) view2.findViewById(R.id.loader_title);
            Loader loader = this.f172715m;
            I5.a(textView, loader != null ? loader.getTitle() : null, false);
            I5.a((TextView) view2.findViewById(R.id.loader_subtitle), loader != null ? loader.getSubtitle() : null, false);
            return G0.f406611a;
        }
    }

    /* compiled from: FormLoader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<ContentPlaceholder, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ContentPlaceholder contentPlaceholder) {
            contentPlaceholder.setState(new WU.a(Integer.valueOf(R.drawable.placeholders_img_general_error), com.avito.android.printable_text.b.c(R.string.installments_unknown_error, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.installments_retry_error, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.installments_update, new Serializable[0]), new h(c.this, 7)));
            return G0.f406611a;
        }
    }

    static {
        new a(null);
        e.a aVar = e.f410651c;
        f172705g = g.g(30, DurationUnit.f410634f);
        f172706h = g.g(50, DurationUnit.f410633e);
    }

    public c(@k ViewGroup viewGroup, @k View view, @l Y41.a<G0> aVar) {
        this.f172707a = view;
        this.f172708b = aVar;
        this.f172710d = f172705g;
        this.f172712f = new C42670a(viewGroup, new b(), R.layout.loader_layout);
    }

    public final void a(@l Loader loader) {
        Integer durationSeconds;
        if (loader != null && (durationSeconds = loader.getDurationSeconds()) != null) {
            int iIntValue = durationSeconds.intValue();
            e.a aVar = e.f410651c;
            this.f172710d = g.g(iIntValue, DurationUnit.f410634f);
        }
        new C5091c(loader).invoke(this.f172712f.f406519d);
    }

    public final void b() {
        this.f172712f.c(Integer.valueOf(R.style.Theme_DesignSystem_Re23), new d());
        com.avito.android.installments.form.loader.d dVar = this.f172709c;
        if (dVar != null) {
            dVar.cancel();
        }
        this.f172709c = null;
    }

    public /* synthetic */ c(ViewGroup viewGroup, View view, Y41.a aVar, int i12, C42822w c42822w) {
        this(viewGroup, view, (i12 & 4) != 0 ? null : aVar);
    }
}

package com.avito.android.candy;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.candy.f;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout;
import com.avito.android.lib.design.skeleton.shimmer.a;
import com.avito.android.lib.design.toggle.Checkmark;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalCheckedImage;
import com.avito.android.remote.model.UniversalCheckedImageKt;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BaseCandyItemView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/candy/a;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_candy-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class a extends com.avito.konveyor.adapter.b {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f114855o = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.candy.e f114856b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f114857c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f114858d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f114859e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Checkmark f114860f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ShimmerFrameLayout f114861g;

    /* renamed from: h, reason: collision with root package name */
    public final int f114862h;

    /* renamed from: i, reason: collision with root package name */
    public final int f114863i;

    /* renamed from: j, reason: collision with root package name */
    public final int f114864j;

    /* renamed from: k, reason: collision with root package name */
    public final int f114865k;

    /* renamed from: l, reason: collision with root package name */
    public final int f114866l;

    /* renamed from: m, reason: collision with root package name */
    public final int f114867m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public y f114868n;

    /* compiled from: BaseCandyItemView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/candy/a$a;", "", "<init>", "()V", "", "SHIMMER_DURATION", "J", "", "SHIMMER_HIGHLIGHT_ALPHA", "F", "TEXT_ANIMATION_DURATION", "_avito_candy-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.candy.a$a, reason: collision with other inner class name */
    public static final class C3351a {
        public /* synthetic */ C3351a(C42822w c42822w) {
            this();
        }

        public C3351a() {
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f114869b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f114870c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Image f114871d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f114872e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ CandyImageState f114873f;

        public b(View view, a aVar, Image image, String str, CandyImageState candyImageState) {
            this.f114869b = view;
            this.f114870c = aVar;
            this.f114871d = image;
            this.f114872e = str;
            this.f114873f = candyImageState;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            int i22 = a.f114855o;
            this.f114870c.F80(this.f114871d, this.f114872e, this.f114873f);
            this.f114869b.removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: BaseCandyItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = a.f114855o;
            a aVar = a.this;
            aVar.B80();
            aVar.C80();
        }
    }

    /* compiled from: BaseCandyItemView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/candy/f$a;", "loadingState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) throws Resources.NotFoundException {
            P2 p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.c;
            a aVar = a.this;
            if (z12) {
                D6.H(aVar.f114861g);
                return;
            }
            if (!(p22 instanceof P2.b)) {
                if (p22 instanceof P2.a) {
                    int i12 = a.f114855o;
                    aVar.B80();
                    aVar.C80();
                    return;
                }
                return;
            }
            int i13 = a.f114855o;
            aVar.B80();
            f.a aVar2 = (f.a) ((P2.b) p22).f318720a;
            boolean z13 = aVar2 instanceof f.a.C3352a;
            SimpleDraweeView simpleDraweeView = aVar.f114859e;
            if (!z13) {
                if (!(aVar2 instanceof f.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                aVarA.f(((f.a.b) aVar2).f114888a);
                aVarA.c();
                G0 g02 = G0.f406611a;
                return;
            }
            Resources resources = aVar.itemView.getResources();
            int i14 = ((f.a.C3352a) aVar2).f114887a;
            Resources.Theme themeNewTheme = aVar.itemView.getResources().newTheme();
            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
            Drawable drawable = resources.getDrawable(i14, themeNewTheme);
            if (drawable != null) {
                ImageRequest.a aVarA2 = C35949t5.a(simpleDraweeView);
                aVarA2.f169484b = new ImageRequest.d.a(drawable, null);
                aVarA2.c();
                G0 g03 = G0.f406611a;
            }
        }
    }

    /* compiled from: BaseCandyItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = a.f114855o;
            a aVar = a.this;
            aVar.B80();
            aVar.C80();
        }
    }

    static {
        new C3351a(null);
    }

    public a(@Y61.k View view, @Y61.k com.avito.android.candy.e eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super(view);
        this.f114856b = eVar;
        this.f114857c = interfaceC35745a5;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f114858d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f114859e = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.checkbox);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkmark");
        }
        this.f114860f = (Checkmark) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.shimmer_layout);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout");
        }
        this.f114861g = (ShimmerFrameLayout) viewFindViewById4;
        this.f114862h = C35835l0.d(R.attr.black, view.getContext());
        this.f114863i = C35835l0.d(R.attr.constantWhite, view.getContext());
        this.f114864j = C35835l0.d(R.attr.gray48, view.getContext());
        this.f114865k = androidx.core.content.d.getColor(view.getContext(), R.color.common_constant_gray_84);
        this.f114866l = C35835l0.d(R.attr.gray4, view.getContext());
        this.f114867m = C35835l0.d(R.attr.gray24, view.getContext());
    }

    public final void B80() {
        D6.w(this.f114861g);
    }

    public final void C80() {
        boolean zIsChecked = this.f114860f.isChecked();
        SimpleDraweeView simpleDraweeView = this.f114859e;
        if (zIsChecked) {
            simpleDraweeView.setBackgroundResource(R.drawable.candy_background_checked);
        } else {
            simpleDraweeView.setBackgroundResource(R.drawable.candy_background);
        }
    }

    public final void D80(boolean z12) {
        Checkmark checkmark = this.f114860f;
        checkmark.setChecked(z12);
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.f114862h, this.f114863i);
        valueAnimatorOfArgb.setDuration(300L);
        valueAnimatorOfArgb.addUpdateListener(new AV.a(this, 5));
        if (!checkmark.isEnabled()) {
            this.f114858d.setTextColor(this.f114864j);
        } else if (checkmark.isChecked()) {
            valueAnimatorOfArgb.start();
        } else {
            valueAnimatorOfArgb.reverse();
        }
        C80();
        a.c cVar = new a.c();
        int i12 = checkmark.isChecked() ? this.f114865k : this.f114866l;
        com.avito.android.lib.design.skeleton.shimmer.a aVar = cVar.f180558a;
        aVar.f180541e = (i12 & 16777215) | (aVar.f180541e & (-16777216));
        aVar.f180540d = this.f114867m;
        this.f114861g.a(cVar.e(0.3f).d(3000L).a());
    }

    public final void E80(@Y61.l UniversalCheckedImage universalCheckedImage, @Y61.l String str) {
        if (this.f114860f.isChecked()) {
            F80(universalCheckedImage != null ? universalCheckedImage.getImageChecked() : null, str, CandyImageState.f114851e);
        } else {
            boolean zB2 = com.avito.android.lib.util.darkTheme.c.b(this.itemView.getContext());
            F80(universalCheckedImage != null ? UniversalCheckedImageKt.getImageDependsOnThemeOrDefault(universalCheckedImage, zB2) : null, str, zB2 ? CandyImageState.f114849c : CandyImageState.f114850d);
        }
    }

    public final void F80(Image image, String str, CandyImageState candyImageState) {
        SimpleDraweeView simpleDraweeView = this.f114859e;
        if (D6.s(simpleDraweeView) == 0) {
            SimpleDraweeView simpleDraweeView2 = this.f114859e;
            simpleDraweeView2.addOnLayoutChangeListener(new b(simpleDraweeView2, this, image, str, candyImageState));
            return;
        }
        Uri uriD = C35829k2.c(image, simpleDraweeView, 1, 22).d();
        if (str == null) {
            B80();
            C80();
            return;
        }
        y yVar = this.f114868n;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f114868n = (y) this.f114856b.a(str, candyImageState, uriD, D6.s(simpleDraweeView), D6.r(simpleDraweeView)).j0(this.f114857c.e()).I(new c()).v0(new d(), new e(), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    public void UV(@Y61.l UniversalCheckedImage universalCheckedImage, @Y61.l String str) {
        E80(universalCheckedImage, str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        B80();
        C35949t5.a(this.f114859e).b();
        y yVar = this.f114868n;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    public void setChecked(boolean z12) {
        D80(z12);
    }
}

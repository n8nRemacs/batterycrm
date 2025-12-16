package com.avito.android.mandatory_verification.presentation;

import LV.c;
import UX.a;
import UX.c;
import VU.b;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.lib.design.floating_container.a;
import com.avito.android.lib.design.floating_container.b;
import com.avito.android.mandatory_verification.data.model.MandatoryVerificationData;
import com.avito.android.mandatory_verification.items.accountVerification.MandatoryVerificationAccountVerificationItem;
import com.avito.android.mandatory_verification.items.uploader.MandatoryVerificationUploaderItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: MandatoryVerificationView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/e;", "", "b", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f184735g = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f184736a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<UX.a, G0> f184737b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecyclerView f184738c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FrameLayout f184739d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C42670a f184740e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final FloatingContainer f184741f;

    /* compiled from: MandatoryVerificationView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/e$b;", "", "<init>", "()V", "", "OPACITY_FULL", "F", "OPACITY_HALF", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    public e(@k l lVar, @k View view, @k com.avito.konveyor.adapter.d dVar) {
        this.f184736a = dVar;
        this.f184737b = lVar;
        CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = (CollapsingTitleAppBarLayout) view.findViewById(R.id.app_bar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.mandatory_verification_recycler_view);
        this.f184738c = recyclerView;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.mandatory_verification_content_root);
        this.f184739d = frameLayout;
        this.f184740e = new C42670a(frameLayout, null, 0, 6, null);
        this.f184741f = (FloatingContainer) view.findViewById(R.id.floating_container);
        recyclerView.setAdapter(dVar);
        collapsingTitleAppBarLayout.setClickListener(new a());
    }

    public final void a(@k UX.c cVar) {
        boolean z12 = cVar instanceof c.C1129c;
        C42670a c42670a = this.f184740e;
        RecyclerView recyclerView = this.f184738c;
        FrameLayout frameLayout = this.f184739d;
        if (z12) {
            c.C1129c c1129c = (c.C1129c) cVar;
            UX.d dVar = c1129c.f16436f;
            ArrayList arrayList = dVar.f16438b;
            com.avito.konveyor.adapter.d dVar2 = this.f184736a;
            dVar2.l(arrayList, null);
            ArrayList arrayList2 = dVar.f16438b;
            Iterator it = arrayList2.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                } else if (((com.avito.conveyor_item.a) it.next()) instanceof MandatoryVerificationUploaderItem) {
                    break;
                } else {
                    i12++;
                }
            }
            dVar2.notifyItemChanged(i12);
            frameLayout.setAlpha(1.0f);
            c42670a.b();
            MandatoryVerificationData mandatoryVerificationData = c1129c.f16435e;
            if (mandatoryVerificationData.f184430d.f184441h != null) {
                Iterator it2 = arrayList2.iterator();
                int i13 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i13 = -1;
                        break;
                    } else if (((com.avito.conveyor_item.a) it2.next()) instanceof MandatoryVerificationAccountVerificationItem) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i13 >= 0) {
                    recyclerView.F0(i13);
                }
            } else if (mandatoryVerificationData.f184431e.f184468q != null) {
                Iterator it3 = arrayList2.iterator();
                int i14 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i14 = -1;
                        break;
                    } else if (((com.avito.conveyor_item.a) it3.next()) instanceof MandatoryVerificationUploaderItem) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 >= 0) {
                    recyclerView.F0(i14);
                }
            }
        } else if (cVar instanceof c.d) {
            frameLayout.setAlpha(0.5f);
            C42670a.d(c42670a);
        } else if (cVar instanceof c.b) {
            frameLayout.setAlpha(1.0f);
            c42670a.c(null, new h(this));
        }
        boolean z13 = z12 ? true : cVar instanceof c.d;
        FloatingContainer floatingContainer = this.f184741f;
        if (!z13) {
            D6.w(floatingContainer);
            return;
        }
        D6.H(floatingContainer);
        b.a aVar = com.avito.android.lib.design.floating_container.b.f179184i;
        Context context = floatingContainer.getContext();
        int iJ2 = C35835l0.j(R.attr.floatingContainerIncomplete, floatingContainer.getContext());
        aVar.getClass();
        floatingContainer.setStyle(com.avito.android.lib.design.floating_container.b.a(b.a.b(iJ2, context), null, y6.b(16), y6.b(10), y6.b(10), 241));
        View viewInflate = LayoutInflater.from(floatingContainer.getContext()).inflate(R.layout.mandatory_verification_floating_container_content, (ViewGroup) floatingContainer, false);
        Button button = (Button) viewInflate.findViewById(R.id.proceed_button);
        TextView textView = (TextView) viewInflate.findViewById(R.id.bottom_text);
        b.a aVar2 = VU.b.f17147t;
        Context context2 = viewInflate.getContext();
        int iD2 = com.avito.android.lib.util.f.d(cVar.getF16433b().f184432f.f184449d);
        aVar2.getClass();
        button.setStyle((VU.b) c.a.a(aVar2, context2, iD2));
        button.setState(new UU.a(cVar.getF16433b().f184432f.f184447b, null, false, false, false, new f(this), null, null, null, false, 990, null));
        j.a(textView, cVar.getF16433b().f184433g, null);
        floatingContainer.setState(new com.avito.android.lib.design.floating_container.a(new a.AbstractC5270a.C5271a(viewInflate)));
        if (z12) {
            if (!floatingContainer.isLaidOut() || floatingContainer.isLayoutRequested()) {
                floatingContainer.addOnLayoutChangeListener(new g(this));
                return;
            }
            int height = floatingContainer.getHeight();
            if (height <= 0 || recyclerView.getItemDecorationCount() != 0) {
                return;
            }
            recyclerView.l(new i(height), -1);
        }
    }

    /* compiled from: MandatoryVerificationView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mandatory_verification/presentation/e$a", "Lru/avito/component/toolbar/a;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ru.avito.component.toolbar.a {
        public a() {
        }

        @Override // ru.avito.component.toolbar.a
        public final void R() {
            e.this.f184737b.invoke(a.C1127a.f16419a);
        }

        @Override // ru.avito.component.toolbar.a
        public final void u() {
        }
    }
}

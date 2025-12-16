package com.yandex.div.core.view2;

import android.view.View;
import androidx.core.view.C22823h0;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.yandex.div2.DivAccessibility;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import x21.C49755a;

/* compiled from: DivAccessibilityBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/t;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38037t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f369177a;

    /* compiled from: DivAccessibilityBinder.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.t$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DivAccessibility.Type.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            iArr[4] = 5;
            iArr[5] = 6;
            iArr[6] = 7;
            int[] iArr2 = new int[DivAccessibility.Mode.values().length];
            iArr2[2] = 1;
            iArr2[1] = 2;
            iArr2[0] = 3;
        }
    }

    /* compiled from: DivAccessibilityBinder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "Landroidx/core/view/accessibility/f;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "invoke", "(Landroid/view/View;Landroidx/core/view/accessibility/f;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.t$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<View, androidx.core.view.accessibility.f, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DivAccessibility.Type f369179m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DivAccessibility.Type type) {
            super(2);
            this.f369179m = type;
        }

        @Override // Y41.p
        public final G0 invoke(View view, androidx.core.view.accessibility.f fVar) {
            androidx.core.view.accessibility.f fVar2 = fVar;
            if (fVar2 != null) {
                C38037t.this.getClass();
                DivAccessibility.Type type = this.f369179m;
                String str = "android.widget.TextView";
                switch (type.ordinal()) {
                    case 1:
                        str = "android.widget.Button";
                        break;
                    case 2:
                        str = "android.widget.ImageView";
                        break;
                    case 3:
                    case 5:
                        break;
                    case 4:
                        str = "android.widget.EditText";
                        break;
                    case 6:
                        str = "android.widget.TabWidget";
                        break;
                    default:
                        str = "";
                        break;
                }
                fVar2.k(str);
                if (DivAccessibility.Type.HEADER == type) {
                    fVar2.q(true);
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public C38037t(@com.yandex.div.core.dagger.B boolean z12) {
        this.f369177a = z12;
    }

    public static void a(View view, DivAccessibility.Mode mode, C38029k c38029k, boolean z12) {
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 0) {
            view.setImportantForAccessibility(0);
            view.setFocusable(true);
        } else if (iOrdinal == 1) {
            view.setImportantForAccessibility(1);
            if (z12) {
                view.setClickable(false);
                view.setLongClickable(false);
                view.setFocusable(false);
            } else {
                view.setFocusable(true);
            }
        } else if (iOrdinal == 2) {
            view.setImportantForAccessibility(4);
            view.setFocusable(false);
        }
        c38029k.f369150w.put(view, mode);
    }

    public final void b(@Y61.k View view, @Y61.k C38029k c38029k, @Y61.k DivAccessibility.Mode mode) {
        char c12;
        if (this.f369177a) {
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            DivAccessibility.Mode mode2 = view2 != null ? c38029k.f369150w.get(view2) : null;
            if (mode2 == null) {
                a(view, mode, c38029k, false);
                return;
            }
            int iOrdinal = mode2.ordinal();
            char c13 = 2;
            if (iOrdinal == 0) {
                c12 = 2;
            } else if (iOrdinal == 1) {
                c12 = 1;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c12 = 0;
            }
            int iOrdinal2 = mode.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    c13 = 1;
                } else {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c13 = 0;
                }
            }
            if (c12 < c13) {
                mode = mode2;
            }
            a(view, mode, c38029k, mode2 == mode);
        }
    }

    public final void c(@Y61.k View view, @Y61.k DivAccessibility.Type type) {
        if (this.f369177a) {
            C22823h0.C(view, (type == DivAccessibility.Type.LIST && (view instanceof C49755a)) ? new C37928b((C49755a) view) : new C37927a(C22823h0.f(view), new b(type)));
        }
    }
}

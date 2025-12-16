package ki;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.shared.tabs.BeduinTabStyle;
import com.avito.android.beduin.common.shared.tabs.c;
import com.avito.android.beduin.common.shared.tabs.d;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinTabContainerLayout.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lki/b;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "view", "Lkotlin/G0;", "setContentView", "(Landroid/view/View;)V", "getContentView", "()Landroid/view/View;", "Ljava/lang/Class;", "e", "Ljava/lang/Class;", "getBoundTabContentType", "()Ljava/lang/Class;", "setBoundTabContentType", "(Ljava/lang/Class;)V", "boundTabContentType", "Lcom/avito/android/beduin/common/shared/tabs/d;", "getResolvedTabs", "()Lcom/avito/android/beduin/common/shared/tabs/d;", "resolvedTabs", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ki.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42696b extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @l
    public BeduinTabStyle f406544b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public c f406545c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public com.avito.android.beduin.common.shared.tabs.a f406546d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public Class<?> boundTabContentType;

    /* compiled from: BeduinTabContainerLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ki.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f406548a;

        static {
            int[] iArr = new int[BeduinTabStyle.values().length];
            try {
                iArr[BeduinTabStyle.TABS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinTabStyle.AVITO_NON_TRANSPARENT_TABS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f406548a = iArr;
        }
    }

    public C42696b(@k Context context) {
        super(context);
        setOrientation(1);
    }

    public final void a(@k BeduinTabStyle beduinTabStyle, @k List<? extends com.avito.android.lib.deprecated_design.tab.a> list, int i12, @l View view, @k Y41.l<? super Integer, G0> lVar) {
        ViewGroup view2;
        c cVar = this.f406545c;
        if (cVar != null) {
            cVar.f103473b = null;
        }
        com.avito.android.beduin.common.shared.tabs.a aVar = this.f406546d;
        if (aVar != null) {
            aVar.f103467c = null;
        }
        if (this.f406544b != beduinTabStyle) {
            this.f406544b = beduinTabStyle;
            int i13 = a.f406548a[beduinTabStyle.ordinal()];
            if (i13 == 1) {
                this.f406545c = new c(getContext(), null, 2, null);
            } else if (i13 != 2) {
                this.f406546d = new com.avito.android.beduin.common.shared.tabs.a(getContext(), beduinTabStyle);
            } else {
                this.f406545c = new c(getContext(), Integer.valueOf(R.layout.tab_non_transparent));
            }
            if (getChildCount() > 0) {
                removeViewAt(0);
            }
            d resolvedTabs = getResolvedTabs();
            if (resolvedTabs != null && (view2 = resolvedTabs.getView()) != null) {
                addView(view2, 0);
            }
        }
        d resolvedTabs2 = getResolvedTabs();
        if (resolvedTabs2 != null) {
            resolvedTabs2.mc(list);
        }
        d resolvedTabs3 = getResolvedTabs();
        if (resolvedTabs3 != null) {
            resolvedTabs3.Qa(i12);
        }
        d resolvedTabs4 = getResolvedTabs();
        if (resolvedTabs4 != null) {
            resolvedTabs4.nc(lVar);
        }
        setContentView(view);
    }

    @l
    public final Class<?> getBoundTabContentType() {
        return this.boundTabContentType;
    }

    @l
    public final View getContentView() {
        return getChildAt(1);
    }

    @l
    public final d getResolvedTabs() {
        BeduinTabStyle beduinTabStyle = this.f406544b;
        return (beduinTabStyle == BeduinTabStyle.TABS || beduinTabStyle == BeduinTabStyle.AVITO_NON_TRANSPARENT_TABS) ? this.f406545c : this.f406546d;
    }

    public final void setBoundTabContentType(@l Class<?> cls) {
        this.boundTabContentType = cls;
    }

    public final void setContentView(@l View view) {
        View childAt = getChildAt(1);
        if (L.f(childAt, view)) {
            return;
        }
        if (childAt != null) {
            removeViewAt(1);
        }
        if (view != null) {
            addView(view, 1);
        }
    }
}

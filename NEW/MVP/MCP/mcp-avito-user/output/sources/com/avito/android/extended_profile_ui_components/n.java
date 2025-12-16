package com.avito.android.extended_profile_ui_components;

import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileFloatingContactsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/n;", "", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f153365a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Boolean, G0> f153366b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f153367c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f153368d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Boolean f153369e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public List<FloatingButton> f153370f;

    /* compiled from: ExtendedProfileFloatingContactsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[FloatingButtonType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FloatingButtonType floatingButtonType = FloatingButtonType.f153298b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(@Y61.k View view, @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.k Y41.l<? super Boolean, G0> lVar2) {
        this.f153365a = lVar;
        this.f153366b = lVar2;
        View viewFindViewById = view.findViewById(R.id.contact_bar_redesign_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f153367c = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.contact_bar_redesign_buttons_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f153368d = (LinearLayout) viewFindViewById2;
    }

    public final void a() {
        List<FloatingButton> list;
        Boolean bool = this.f153369e;
        Boolean bool2 = Boolean.TRUE;
        if (L.f(bool, bool2) || (list = this.f153370f) == null || list.isEmpty()) {
            return;
        }
        View view = this.f153367c;
        D6.H(view);
        this.f153366b.invoke(bool2);
        this.f153369e = bool2;
        view.setTranslationY(y6.e(o.f153371a));
        A0 a0A = C22823h0.a(view);
        a0A.g(0.0f);
        a0A.c(100L);
        a0A.h(new m(this, 1));
        a0A.d(new LinearInterpolator());
        a0A.f();
    }

    public final void b() {
        D6.w(this.f153367c);
        Boolean bool = Boolean.FALSE;
        this.f153369e = bool;
        this.f153366b.invoke(bool);
    }
}

package kotlin;

import Jx0.C14258a;
import Vx0.AbstractC15725a;
import android.view.View;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.str_booking.network.models.common.Button;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import com.avito.android.str_booking.network.models.common.Prompt;
import com.avito.android.util.D6;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: ButtonUtils.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*n\u0010\u0007\"4\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u000024\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0000¨\u0006\b"}, d2 = {"Lkotlin/Function4;", "LVx0/a;", "", "", "Lcom/avito/android/str_booking/network/models/common/Prompt;", "LJx0/a;", "Lkotlin/G0;", "ButtonActionCallback", "_avito_str-booking_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: by0.b, reason: from Kotlin metadata */
/* loaded from: classes4.dex */
public final class Function4 {
    public static final void a(@Y61.k View view, @Y61.l Button button, @Y61.l final Y41.r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> rVar) {
        final C14258a c14258aA;
        ButtonAction action;
        ButtonAction action2;
        ButtonAction action3;
        SuggestAnalyticsEvent clickstream;
        ButtonAction action4;
        ButtonAction action5;
        Object obj = null;
        final Prompt prompt = (button == null || (action5 = button.getAction()) == null) ? null : action5.getPrompt();
        final Map<String, String> mapC = (button == null || (action4 = button.getAction()) == null) ? null : action4.c();
        if (button == null || (clickstream = button.getClickstream()) == null) {
            c14258aA = null;
        } else {
            C14258a.f9179c.getClass();
            c14258aA = C14258a.C0546a.a(clickstream);
        }
        final String url = (button == null || (action3 = button.getAction()) == null) ? null : action3.getUrl();
        if (url != null) {
            final int i12 = 0;
            view.setOnClickListener(new View.OnClickListener(rVar, url, mapC, prompt, c14258aA, i12) { // from class: by0.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f57570b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.internal.N f57571c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f57572d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Map f57573e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Prompt f57574f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ C14258a f57575g;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f57570b = i12;
                    this.f57571c = (kotlin.jvm.internal.N) rVar;
                    this.f57572d = url;
                    this.f57573e = mapC;
                    this.f57574f = prompt;
                    this.f57575g = c14258aA;
                }

                /* JADX WARN: Type inference failed for: r5v2, types: [Y41.r, kotlin.jvm.internal.N] */
                /* JADX WARN: Type inference failed for: r5v3, types: [Y41.r, kotlin.jvm.internal.N] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (this.f57570b) {
                        case 0:
                            ?? r52 = this.f57571c;
                            if (r52 != 0) {
                                String str = this.f57572d;
                                String strM0 = C43066x.m0(str, "api/", str);
                                r52.invoke(new AbstractC15725a.C1218a(C43066x.m0(strM0, "web/", strM0), null), this.f57573e, this.f57574f, this.f57575g);
                                break;
                            }
                            break;
                        default:
                            ?? r53 = this.f57571c;
                            if (r53 != 0) {
                                r53.invoke(c.d(this.f57572d), this.f57573e, this.f57574f, this.f57575g);
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        Iterator it = C42745f0.U((button == null || (action2 = button.getAction()) == null) ? null : action2.getHref(), (button == null || (action = button.getAction()) == null) ? null : action.getRedirect()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((String) next) != null) {
                obj = next;
                break;
            }
        }
        final String str = (String) obj;
        if (str != null) {
            final int i13 = 1;
            view.setOnClickListener(new View.OnClickListener(rVar, str, mapC, prompt, c14258aA, i13) { // from class: by0.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f57570b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.internal.N f57571c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f57572d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Map f57573e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Prompt f57574f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ C14258a f57575g;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f57570b = i13;
                    this.f57571c = (kotlin.jvm.internal.N) rVar;
                    this.f57572d = str;
                    this.f57573e = mapC;
                    this.f57574f = prompt;
                    this.f57575g = c14258aA;
                }

                /* JADX WARN: Type inference failed for: r5v2, types: [Y41.r, kotlin.jvm.internal.N] */
                /* JADX WARN: Type inference failed for: r5v3, types: [Y41.r, kotlin.jvm.internal.N] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (this.f57570b) {
                        case 0:
                            ?? r52 = this.f57571c;
                            if (r52 != 0) {
                                String str2 = this.f57572d;
                                String strM0 = C43066x.m0(str2, "api/", str2);
                                r52.invoke(new AbstractC15725a.C1218a(C43066x.m0(strM0, "web/", strM0), null), this.f57573e, this.f57574f, this.f57575g);
                                break;
                            }
                            break;
                        default:
                            ?? r53 = this.f57571c;
                            if (r53 != 0) {
                                r53.invoke(c.d(this.f57572d), this.f57573e, this.f57574f, this.f57575g);
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }

    public static final void b(@Y61.k LinearLayout linearLayout, @Y61.l List<Button> list, @Y61.k View view, @Y61.l Y41.r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> rVar) {
        int size = list != null ? list.size() : 0;
        D6.G(linearLayout, size > 0);
        linearLayout.removeAllViews();
        if (list != null) {
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Button button = (Button) obj;
                com.avito.android.lib.design.button.Button button2 = new com.avito.android.lib.design.button.Button(view.getContext(), null, 0, 0, 14, null);
                com.avito.android.lib.design.button.b.a(button2, button != null ? button.getTitle() : null, false);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                layoutParams.weight = 1.0f;
                int i14 = (int) (4 * view.getContext().getResources().getDisplayMetrics().density);
                if (size <= 1) {
                    layoutParams.setMargins(0, 0, 0, 0);
                } else if (i12 != 0 && i12 != size - 1) {
                    layoutParams.setMargins(i14, 0, i14, 0);
                } else if (i12 == 0) {
                    layoutParams.setMargins(0, 0, i14, 0);
                } else {
                    layoutParams.setMargins(i14, 0, 0, 0);
                }
                String preset = button != null ? button.getPreset() : null;
                if (preset == null) {
                    preset = "";
                }
                button2.setAppearanceFromAttr(c(preset));
                button2.setLayoutParams(layoutParams);
                a(button2, button, rVar);
                linearLayout.addView(button2);
                i12 = i13;
            }
        }
    }

    public static final int c(@Y61.k String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -817598092) {
            if (iHashCode != -314765822) {
                if (iHashCode == -213768444 && str.equals("overlaySecondary")) {
                    return R.attr.buttonOverlaySecondaryMedium;
                }
            } else if (str.equals("primary")) {
                return R.attr.buttonPrimaryMedium;
            }
        } else if (str.equals("secondary")) {
            return R.attr.buttonSecondaryMedium;
        }
        return com.avito.android.lib.util.f.d(str);
    }
}

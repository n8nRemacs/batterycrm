package com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.l0;
import kotlin.text.C43066x;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class n implements AppBarLayout.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f113090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f113091c;

    public /* synthetic */ n(Object obj, int i12) {
        this.f113090b = i12;
        this.f113091c = obj;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void c(AppBarLayout appBarLayout, int i12) {
        int i13;
        String str;
        String str2;
        Object obj = this.f113091c;
        switch (this.f113090b) {
            case 0:
                float totalScrollRange = 1 + (i12 / appBarLayout.getTotalScrollRange());
                p pVar = (p) obj;
                RecyclerView recyclerView = pVar.f113107n;
                boolean z12 = recyclerView.computeVerticalScrollOffset() == 0;
                boolean z13 = pVar.f113116w;
                View view = pVar.f113102i;
                if (!z13) {
                    int iB2 = (int) ((y6.b(9) * totalScrollRange) + y6.b(7));
                    if (D6.r(view) != iB2) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        layoutParams.height = iB2;
                        view.setLayoutParams(layoutParams);
                    }
                } else if (D6.r(view) != 0) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    layoutParams2.height = 0;
                    view.setLayoutParams(layoutParams2);
                }
                pVar.f113116w = z12 && totalScrollRange > 0.0f;
                if (z12) {
                    pVar.f113103j.setAlpha(1.0f - totalScrollRange);
                }
                boolean z14 = recyclerView.computeVerticalScrollOffset() == 0;
                boolean z15 = totalScrollRange > 0.0f;
                FrameLayout frameLayout = pVar.f113108o;
                if (z14 || !z15) {
                    D6.w(frameLayout);
                } else {
                    D6.H(frameLayout);
                }
                boolean z16 = (recyclerView.computeVerticalScrollOffset() == 0) && ((totalScrollRange > 0.0f ? 1 : (totalScrollRange == 0.0f ? 0 : -1)) > 0);
                if (z16 != pVar.f113119z) {
                    pVar.f113119z = z16;
                    ValueAnimator valueAnimator = pVar.f113118y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i14 = pVar.f113117x;
                    TextView textView = pVar.f113097d;
                    if (i14 == 0 && z16) {
                        textView.measure(View.MeasureSpec.makeMeasureSpec(textView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        int measuredHeight = textView.getMeasuredHeight();
                        pVar.f113117x = measuredHeight >= 1 ? measuredHeight : 1;
                    }
                    int height = textView.getHeight();
                    int i15 = z16 ? pVar.f113117x : 0;
                    if (height != i15) {
                        textView.setVisibility(0);
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, i15);
                        valueAnimatorOfInt.setDuration(200L);
                        valueAnimatorOfInt.setInterpolator(new androidx.interpolator.view.animation.b());
                        valueAnimatorOfInt.addUpdateListener(new AV.a(pVar, 4));
                        valueAnimatorOfInt.addListener(new o(z16, pVar));
                        valueAnimatorOfInt.start();
                        pVar.f113118y = valueAnimatorOfInt;
                        break;
                    }
                }
                break;
            case 1:
                int i16 = com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.i.f113136q;
                float totalScrollRange2 = i12 / appBarLayout.getTotalScrollRange();
                float f12 = 1;
                float f13 = totalScrollRange2 + f12;
                com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.i iVar = (com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.i) obj;
                com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.i.b(iVar.f113138b, f13);
                double d12 = f13;
                View view2 = iVar.f113144h;
                if (d12 > 0.4d) {
                    int iB3 = y6.b(20);
                    if (D6.r(view2) != iB3) {
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        layoutParams3.height = iB3;
                        view2.setLayoutParams(layoutParams3);
                    }
                } else {
                    int iB4 = (int) ((f12 + f13) * y6.b(14));
                    if (D6.r(view2) != iB4) {
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        layoutParams4.height = iB4;
                        view2.setLayoutParams(layoutParams4);
                    }
                }
                RecyclerView recyclerView2 = iVar.f113140d;
                boolean z17 = recyclerView2.computeVerticalScrollOffset() == 0;
                if (z17) {
                    int i17 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
                }
                if (z17) {
                    iVar.f113143g.setAlpha(1.0f - f13);
                }
                boolean z18 = recyclerView2.computeVerticalScrollOffset() == 0;
                i13 = f13 <= 0.0f ? 0 : 1;
                View view3 = iVar.f113145i;
                FrameLayout frameLayout2 = iVar.f113139c;
                if (z18 || i13 == 0) {
                    D6.w(frameLayout2);
                    view3.setBackgroundColor(iVar.f113150n);
                } else {
                    D6.H(frameLayout2);
                    view3.setBackgroundColor(iVar.f113151o);
                }
                float f14 = f13 < 0.2f ? f13 <= 0.0f ? 1.0f : (0.2f - f13) / 0.2f : 0.0f;
                iVar.f113146j.setAlpha(f14);
                iVar.f113147k.setAlpha(f14);
                break;
            case 2:
                int i18 = com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.j.f113180o;
                float totalScrollRange3 = i12 / appBarLayout.getTotalScrollRange();
                float f15 = 1;
                float f16 = totalScrollRange3 + f15;
                com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.j jVar = (com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.j) obj;
                com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.j.l(jVar.f113186f.getContainer(), f16);
                if (jVar.f113194n) {
                    if (f16 > 0.4d) {
                        jVar.n(y6.b(20));
                    } else {
                        jVar.n((int) ((f15 + f16) * y6.b(14)));
                    }
                } else if (f16 > 0.4d) {
                    jVar.n((int) (y6.b(32) * f16));
                } else {
                    jVar.n(y6.b(14));
                }
                RecyclerView recyclerView3 = jVar.f113184d;
                boolean z19 = recyclerView3.computeVerticalScrollOffset() == 0;
                jVar.f113194n = z19 && f16 > 0.0f;
                if (z19) {
                    jVar.f113188h.setAlpha(1.0f - f16);
                }
                boolean z22 = recyclerView3.computeVerticalScrollOffset() == 0;
                i13 = f16 <= 0.0f ? 0 : 1;
                FrameLayout frameLayout3 = jVar.f113185e;
                if (!z22 && i13 != 0) {
                    D6.H(frameLayout3);
                    break;
                } else {
                    D6.w(frameLayout3);
                    break;
                }
                break;
            case 3:
                float totalScrollRange4 = 1.0f - ((-i12) / appBarLayout.getTotalScrollRange());
                com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.k kVar = (com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.k) obj;
                kVar.f113219d.setAlpha(totalScrollRange4);
                TextView textView2 = kVar.f113220e;
                if (totalScrollRange4 > 0.5f) {
                    textView2.setAlpha(0.0f);
                    break;
                } else {
                    textView2.setAlpha((0.5f - totalScrollRange4) * 2);
                    break;
                }
            case 4:
                TextView textView3 = ((com.avito.android.mortgage.landing.o) obj).f200317r;
                if (appBarLayout != null && Math.abs(i12) == appBarLayout.getTotalScrollRange()) {
                    D6.H(textView3);
                    break;
                } else {
                    D6.w(textView3);
                    break;
                }
                break;
            case 5:
                ((l0.f) obj).f406840b = i12;
                break;
            default:
                int i19 = CollapsingTitleAppBarLayout.f430573Q;
                CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = (CollapsingTitleAppBarLayout) obj;
                int i22 = -collapsingTitleAppBarLayout.getResources().getDimensionPixelSize(R.dimen.publish_appbar_title_move_to_full_disappear);
                if (i12 >= 0) {
                    collapsingTitleAppBarLayout.l();
                    i12 = 0;
                } else if (i12 < i22) {
                    if (!collapsingTitleAppBarLayout.f430584K) {
                        collapsingTitleAppBarLayout.f430584K = true;
                        String str3 = collapsingTitleAppBarLayout.shortTitle;
                        if (str3 == null || C43066x.K(str3) || (str2 = collapsingTitleAppBarLayout.navigationTitle) == null || C43066x.K(str2)) {
                            String str4 = collapsingTitleAppBarLayout.shortTitle;
                            if ((str4 == null || C43066x.K(str4)) && ((str = collapsingTitleAppBarLayout.navigationTitle) == null || C43066x.K(str))) {
                                TextView textView4 = collapsingTitleAppBarLayout.f430576C;
                                if (textView4 == null) {
                                    textView4 = null;
                                }
                                textView4.animate().alpha(0.0f).setDuration(250L).start();
                            } else {
                                TextView textView5 = collapsingTitleAppBarLayout.f430576C;
                                if (textView5 == null) {
                                    textView5 = null;
                                }
                                String str5 = collapsingTitleAppBarLayout.shortTitle;
                                if (str5 == null) {
                                    str5 = collapsingTitleAppBarLayout.navigationTitle;
                                }
                                textView5.setText(str5);
                                TextView textView6 = collapsingTitleAppBarLayout.f430576C;
                                if (textView6 == null) {
                                    textView6 = null;
                                }
                                textView6.animate().alpha(1.0f).setDuration(250L).start();
                            }
                        } else {
                            String str6 = collapsingTitleAppBarLayout.shortTitle;
                            if (str6 == null) {
                                str6 = collapsingTitleAppBarLayout.navigationTitle;
                            }
                            collapsingTitleAppBarLayout.n(str6);
                        }
                    }
                    i12 = i22;
                } else {
                    collapsingTitleAppBarLayout.l();
                }
                TextView textView7 = collapsingTitleAppBarLayout.f430574A;
                (textView7 != null ? textView7 : null).setAlpha(1.0f - (i12 / i22));
                break;
        }
    }
}

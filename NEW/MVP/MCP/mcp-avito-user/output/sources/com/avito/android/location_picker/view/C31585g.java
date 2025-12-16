package com.avito.android.location_picker.view;

import android.text.Editable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import android.widget.HorizontalScrollView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPointKt;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.location_picker.analytics.ScreenCloseFromBlock;
import com.avito.android.location_picker.view.AbstractC31586h;
import com.avito.android.location_picker.view.radius.RadiusCircleViewImpl;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.ui.view.BackPressedNotifyingEditText;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.collections.C42745f0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.location_picker.view.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C31585g implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f182559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC31586h f182560c;

    public /* synthetic */ C31585g(AbstractC31586h abstractC31586h, int i12) {
        this.f182559b = i12;
        this.f182560c = abstractC31586h;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AvitoMapBounds avitoMapBounds;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        switch (this.f182559b) {
            case 0:
                String str = (String) obj;
                AbstractC31586h abstractC31586h = this.f182560c;
                com.avito.android.lib.design.tooltip.k kVar = abstractC31586h.f182570J;
                if (kVar != null) {
                    kVar.dismiss();
                }
                abstractC31586h.f182570J = null;
                com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(abstractC31586h.f182588b.getContext(), 0, 0, 6, null);
                kVar2.f181224j = new r.a(new i.a(new b.a()));
                int i12 = kVar2.f181229o;
                kVar2.f181228n = -2;
                kVar2.f181229o = i12;
                com.avito.android.lib.design.tooltip.p.a(kVar2, new AbstractC31586h.r(str));
                abstractC31586h.f182570J = kVar2.f(abstractC31586h.f182624t);
                break;
            case 1:
                this.f182560c.f182616p.setEnabled(((Boolean) obj).booleanValue());
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AbstractC31586h abstractC31586h2 = this.f182560c;
                BackPressedNotifyingEditText backPressedNotifyingEditText = abstractC31586h2.f182622s;
                if (zBooleanValue) {
                    backPressedNotifyingEditText.requestFocus();
                    K2.i(backPressedNotifyingEditText);
                } else {
                    HorizontalScrollView horizontalScrollView = abstractC31586h2.f182624t;
                    int width = horizontalScrollView.getChildAt(0).getWidth() - horizontalScrollView.getScrollX();
                    if (width > 0) {
                        horizontalScrollView.smoothScrollBy(width, 0);
                    }
                    backPressedNotifyingEditText.clearFocus();
                    Fragment fragment = abstractC31586h2.f182590c;
                    K2.e(fragment);
                    ActivityC22955m activityC22955mL1 = fragment.l1();
                    if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
                        ActivityC22955m activityC22955mL12 = fragment.l1();
                        Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
                        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(abstractC31586h2.f182588b.getWindowToken(), 0);
                        }
                    }
                }
                D6.G(abstractC31586h2.f182614o, zBooleanValue);
                break;
            case 3:
                String str2 = (String) obj;
                final AbstractC31586h abstractC31586h3 = this.f182560c;
                BackPressedNotifyingEditText backPressedNotifyingEditText2 = abstractC31586h3.f182622s;
                if (!str2.equals(String.valueOf(backPressedNotifyingEditText2.getText()))) {
                    backPressedNotifyingEditText2.setText(str2);
                    backPressedNotifyingEditText2.post(new Runnable() { // from class: com.avito.android.location_picker.view.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            HorizontalScrollView horizontalScrollView2 = abstractC31586h3.f182624t;
                            int width2 = horizontalScrollView2.getChildAt(0).getWidth() - horizontalScrollView2.getScrollX();
                            if (width2 > 0) {
                                horizontalScrollView2.smoothScrollBy(width2, 0);
                            }
                        }
                    });
                    break;
                }
                break;
            case 4:
                Editable text = this.f182560c.f182622s.getText();
                if (text != null) {
                    text.clear();
                    break;
                }
                break;
            case 5:
                List<AddressSuggestion> list = (List) obj;
                boolean zIsEmpty = list.isEmpty();
                AbstractC31586h abstractC31586h4 = this.f182560c;
                View view = abstractC31586h4.f182620r;
                if (zIsEmpty) {
                    D6.w(view);
                    break;
                } else {
                    D6.G(view, true);
                    X x12 = abstractC31586h4.f182564D;
                    x12.f182553f = list;
                    x12.notifyDataSetChanged();
                    break;
                }
            case 6:
                AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
                AvitoMap avitoMap = this.f182560c.f182610m;
                if (avitoMap != null) {
                    boolean z12 = avitoMapCameraPosition.getZoomLevel() == avitoMap.getMapTarget().getZoomLevel();
                    boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition.getMapPoint(), avitoMap.getMapTarget().getPoint());
                    if (avitoMapCameraPosition.getViewportBounds() != null) {
                        AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
                        if (viewportBounds != null) {
                            avitoMap.moveTo(viewportBounds, true);
                            break;
                        }
                    } else if (!z12 && !zAlmostEqual) {
                        avitoMap.moveTo(avitoMapCameraPosition.getMapPoint(), true, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
                        break;
                    } else if (z12) {
                        if (!zAlmostEqual) {
                            AvitoMap.DefaultImpls.moveTo$default(avitoMap, avitoMapCameraPosition.getMapPoint(), true, null, 4, null);
                            break;
                        }
                    } else {
                        AvitoMap.DefaultImpls.zoomTo$default(avitoMap, avitoMapCameraPosition.getZoomLevel(), false, null, 6, null);
                        break;
                    }
                }
                break;
            case 7:
                vW.f fVar = (vW.f) obj;
                AbstractC31586h abstractC31586h5 = this.f182560c;
                com.avito.android.location_picker.view.radius.f fVar2 = abstractC31586h5.f182561A;
                if (fVar2.f182793c == null) {
                    View view2 = abstractC31586h5.f182629w;
                    if (view2 != null) {
                        D6.w(view2);
                    }
                    View view3 = abstractC31586h5.f182630x;
                    if (view3 != null) {
                        D6.H(view3);
                    }
                    com.avito.android.location_picker.view.radius.i iVar = abstractC31586h5.f182562B;
                    if (iVar != null) {
                        List<Radius> list2 = fVar.f440802a;
                        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                        for (Radius radius : list2) {
                            String id2 = radius.getId();
                            String str3 = "";
                            if (id2 == null) {
                                id2 = "";
                            }
                            String title = radius.getTitle();
                            if (title != null) {
                                str3 = title;
                            }
                            arrayList.add(new com.avito.android.location_picker.view.radius.a(id2, radius.getDistanceInMeters(), Boolean.valueOf(radius.isActive()), str3));
                        }
                        fVar2.a(iVar, arrayList);
                    }
                }
                if (fVar.f440804c.longValue() != 0 && (avitoMapBounds = fVar.f440803b) != null) {
                    List listU = C42745f0.U(avitoMapBounds.getTopLeft(), avitoMapBounds.getBottomRight());
                    AvitoMap avitoMap2 = abstractC31586h5.f182610m;
                    if (avitoMap2 != null) {
                        AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap2, listU, Integer.valueOf(abstractC31586h5.f182602i.getF182438d()), null, false, null, 28, null);
                        break;
                    }
                }
                break;
            case 8:
                AbstractC31586h abstractC31586h6 = this.f182560c;
                float fIntValue = (float) ((((Number) abstractC31586h6.f182568H.getValue()).intValue() * r11.f440816b) / ((vW.s) obj).f440815a);
                RadiusCircleViewImpl radiusCircleViewImpl = abstractC31586h6.f182631y;
                if (radiusCircleViewImpl != null) {
                    radiusCircleViewImpl.setRadius(fIntValue);
                    break;
                }
                break;
            case 9:
                float f12 = ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
                AbstractC31586h abstractC31586h7 = this.f182560c;
                RadiusCircleViewImpl radiusCircleViewImpl2 = abstractC31586h7.f182631y;
                if (radiusCircleViewImpl2 != null && (viewPropertyAnimatorAnimate = radiusCircleViewImpl2.animate()) != null && (duration = viewPropertyAnimatorAnimate.setDuration(abstractC31586h7.f182571K)) != null && (viewPropertyAnimatorAlpha = duration.alpha(f12)) != null) {
                    viewPropertyAnimatorAlpha.start();
                    break;
                }
                break;
            case 10:
                vW.e eVar = (vW.e) obj;
                String str4 = eVar.f440800a;
                int length = str4.length();
                AbstractC31586h abstractC31586h8 = this.f182560c;
                Button button = abstractC31586h8.f182628v;
                if (length != 0) {
                    if (button != null) {
                        button.setText(str4);
                    }
                    if (button != null) {
                        button.setEnabled(eVar.f440801b);
                        break;
                    }
                } else {
                    if (button != null) {
                        button.setText(abstractC31586h8.f182602i.getF182435a());
                    }
                    if (button != null) {
                        button.setEnabled(false);
                        break;
                    }
                }
                break;
            case 11:
                AbstractC31586h abstractC31586h9 = this.f182560c;
                abstractC31586h9.f182592d.I1((AddressParameter.Value) obj, abstractC31586h9.f182604j);
                break;
            case 12:
                AbstractC31586h abstractC31586h10 = this.f182560c;
                abstractC31586h10.f182632z.accept(ScreenCloseFromBlock.f182205d);
                abstractC31586h10.f182592d.E3((Radius) obj);
                abstractC31586h10.f182593d0.accept(G0.f406611a);
                break;
            case 13:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                AbstractC31586h abstractC31586h11 = this.f182560c;
                if (!abstractC31586h11.f182596f) {
                    AbstractC31586h.a aVar = abstractC31586h11.f182616p;
                    aVar.setLoading(zBooleanValue2);
                    aVar.setEnabled(!zBooleanValue2);
                    break;
                }
                break;
            default:
                D6.G(((T) this.f182560c).f182530w0, ((Boolean) obj).booleanValue());
                break;
        }
    }
}

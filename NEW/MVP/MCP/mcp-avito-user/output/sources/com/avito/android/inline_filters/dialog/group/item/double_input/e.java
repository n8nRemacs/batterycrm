package com.avito.android.inline_filters.dialog.group.item.double_input;

import Y41.l;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.view.C20197i;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.inline_filters.dialog.range.RangeFilterView;
import com.avito.android.inline_filters.dialog.select.C31043m;
import com.avito.android.inline_filters.dialog.select.D;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.gallery.h;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.item_color_picker.ItemColorPicker;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.lib.design.shadow_layout.ShadowFrameLayout;
import com.avito.android.lib.design.tooltip.k;
import com.avito.android.messenger.blacklist_reasons.v;
import com.avito.android.messenger.conversation.create.t;
import com.avito.android.mortgage.person_form.MortgagePersonFormFragment;
import com.avito.android.newcars_mark_model_filter.presentation.NewCarsBrandModelFilterFragment;
import com.avito.android.payment.lib.C33021f;
import com.avito.android.photo_picker.camera_mvi.CameraFragment;
import com.avito.android.profile_phones.add_phone.AddPhoneFragment;
import com.avito.android.profile_phones.confirm_phone.ConfirmPhoneFragment;
import com.avito.android.profile_settings_basic.F;
import com.avito.android.profile_settings_extended.adapter.about.j;
import com.avito.android.publish.details.C33745e;
import com.avito.android.publish.details.InterfaceC33684d;
import com.avito.android.publish.objects.C33890c;
import com.avito.android.publish.objects.N0;
import com.avito.android.publish.price_list.z;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.concurrent.ExecutionException;
import kotlin.G0;
import kotlin.jvm.internal.L;
import kotlin.reflect.n;
import o80.InterfaceC44600a;
import ru.avito.component.toolbar.AppBarLayoutWithIconAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f171585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f171586c;

    public /* synthetic */ e(Object obj, int i12) {
        this.f171585b = i12;
        this.f171586c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws ExecutionException, InterruptedException {
        ImageView imageView;
        Drawable drawable;
        View viewZ;
        int i12 = 0;
        Object obj = this.f171586c;
        switch (this.f171585b) {
            case 0:
                Input input = ((f) obj).f171589c;
                input.requestFocus();
                input.v();
                return;
            case 1:
                ((RangeFilterView) obj).f171962l.v();
                return;
            case 2:
                C31043m c31043m = (C31043m) obj;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c31043m.f172174p.getLayoutManager();
                int iB2 = linearLayoutManager.L1() == linearLayoutManager.o0() - 1 ? y6.b(8) : c31043m.f172176r;
                Button button = c31043m.f172172n;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) button.getLayoutParams();
                marginLayoutParams.setMargins(iB2, marginLayoutParams.topMargin, iB2, marginLayoutParams.bottomMargin);
                button.setLayoutParams(marginLayoutParams);
                return;
            case 3:
                D d12 = (D) obj;
                LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) d12.f172010p.getLayoutManager();
                int iB3 = linearLayoutManager2.L1() == linearLayoutManager2.o0() - 1 ? y6.b(8) : d12.f172012r;
                Button button2 = d12.f172008n;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) button2.getLayoutParams();
                marginLayoutParams2.setMargins(iB3, marginLayoutParams2.topMargin, iB3, marginLayoutParams2.bottomMargin);
                button2.setLayoutParams(marginLayoutParams2);
                return;
            case 4:
                RecyclerView.Adapter adapter = ((Chips) obj).f178693s.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                    return;
                }
                return;
            case 5:
                int i13 = com.avito.android.lib.design.chips.ui.Chips.f178782K0;
                RecyclerView.Adapter adapter2 = ((com.avito.android.lib.design.chips.ui.Chips) obj).getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyDataSetChanged();
                    return;
                }
                return;
            case 6:
                h hVar = (h) obj;
                if (hVar.f179223M0 != 0) {
                    return;
                }
                RecyclerView.m layoutManager = hVar.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager3 = (LinearLayoutManager) layoutManager;
                    if (linearLayoutManager3.H1() == 0) {
                        int iL1 = linearLayoutManager3.L1();
                        com.avito.android.lib.design.gallery.b bVar = hVar.galleryAdapter;
                        if (iL1 == (bVar != null ? bVar.getItemCount() : 0) - 1) {
                            int iE02 = linearLayoutManager3.e0();
                            int i14 = 0;
                            int measuredWidth = 0;
                            for (int i15 = 0; i15 < iE02; i15++) {
                                View viewD0 = linearLayoutManager3.d0(i15);
                                if (viewD0 == null) {
                                    return;
                                }
                                measuredWidth += viewD0.getMeasuredWidth();
                                int measuredWidth2 = viewD0.getMeasuredWidth();
                                ViewGroup.LayoutParams layoutParams = viewD0.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                                i14 += measuredWidth2 + (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0);
                            }
                            int measuredWidth3 = (hVar.getMeasuredWidth() - (hVar.paddingHorizontal * 2)) - i14;
                            if (measuredWidth3 <= 0) {
                                return;
                            }
                            l<? super Boolean, G0> lVar = hVar.f179225O0;
                            if (lVar != null) {
                                lVar.invoke(Boolean.FALSE);
                            }
                            int iE03 = linearLayoutManager3.e0();
                            while (i12 < iE03) {
                                View viewD02 = linearLayoutManager3.d0(i12);
                                if (viewD02 != null) {
                                    int measuredWidth4 = viewD02.getMeasuredWidth() + ((int) ((viewD02.getMeasuredWidth() / measuredWidth) * measuredWidth3));
                                    ViewGroup.LayoutParams layoutParams2 = viewD02.getLayoutParams();
                                    if (layoutParams2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                                    }
                                    RecyclerView.n nVar = (RecyclerView.n) layoutParams2;
                                    ((ViewGroup.MarginLayoutParams) nVar).width = measuredWidth4;
                                    viewD02.setLayoutParams(nVar);
                                    if ((viewD02 instanceof ImageView) && (drawable = (imageView = (ImageView) viewD02).getDrawable()) != null) {
                                        float intrinsicWidth = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
                                        float measuredHeight = measuredWidth4 / imageView.getMeasuredHeight();
                                        h.f179215T0.getClass();
                                        imageView.setScaleType(((measuredHeight > intrinsicWidth ? 1 : (measuredHeight == intrinsicWidth ? 0 : -1)) > 0 ? intrinsicWidth / measuredHeight : measuredHeight / intrinsicWidth) < 0.73f ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER_CROP);
                                    }
                                }
                                i12++;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                RecyclerView.Adapter adapter3 = ((ItemColorPicker) obj).f179439r.getAdapter();
                if (adapter3 != null) {
                    adapter3.notifyDataSetChanged();
                    return;
                }
                return;
            case 8:
                int i16 = SegmentedControl.f180174N;
                ((SegmentedControl) obj).o();
                return;
            case 9:
                ((com.avito.android.lib.design.time_line.d) obj).f180997S0 = true;
                return;
            case 10:
                int i17 = k.f181215q;
                ((k) obj).dismiss();
                return;
            case 11:
                n<Object>[] nVarArr = v.f186653q;
                v vVar = (v) obj;
                vVar.c();
                D6.g(vVar.f186658f);
                D6.w(vVar.f186660h);
                D6.H(vVar.f186662j);
                return;
            case 12:
                ((t) obj).f189626e.k(null);
                return;
            case 13:
                MortgagePersonFormFragment.a aVar = MortgagePersonFormFragment.f200441y0;
                String canonicalName = MortgagePersonFormFragment.class.getCanonicalName();
                MortgagePersonFormFragment mortgagePersonFormFragment = (MortgagePersonFormFragment) obj;
                if (mortgagePersonFormFragment.getParentFragmentManager().L() == 0) {
                    mortgagePersonFormFragment.requireActivity().finish();
                    return;
                }
                FragmentManager parentFragmentManager = mortgagePersonFormFragment.getParentFragmentManager();
                int iL2 = parentFragmentManager.L();
                int i18 = 0;
                while (true) {
                    if (i18 < iL2) {
                        if (L.f(parentFragmentManager.K(i18).getName(), canonicalName)) {
                            i12 = 1;
                        } else {
                            i18++;
                        }
                    }
                }
                if (i12 != 0) {
                    mortgagePersonFormFragment.getParentFragmentManager().a0(1, canonicalName);
                    return;
                } else {
                    mortgagePersonFormFragment.getParentFragmentManager().a0(1, null);
                    return;
                }
            case 14:
                int i19 = com.avito.android.mortgage.root.list.items.navigation.l.f202721g;
                ((com.avito.android.mortgage.root.list.items.navigation.l) obj).B80();
                return;
            case 15:
                RecyclerView recyclerView = ((NewCarsBrandModelFilterFragment) obj).f207285p0;
                (recyclerView != null ? recyclerView : null).A0(0);
                return;
            case 16:
                C33021f c33021f = (C33021f) obj;
                Integer num = c33021f.f214673t;
                if (num != null) {
                    int iIntValue = num.intValue();
                    RecyclerView recyclerView2 = c33021f.f214667n;
                    RecyclerView.m layoutManager2 = recyclerView2.getLayoutManager();
                    if (layoutManager2 == null || (viewZ = layoutManager2.Z(iIntValue)) == null) {
                        return;
                    }
                    recyclerView2.scrollBy(c33021f.f214670q.c(layoutManager2, viewZ)[0], 0);
                    return;
                }
                return;
            case 17:
                TextView textView = (TextView) obj;
                textView.setRotation(90.0f);
                textView.setX(-((textView.getWidth() / 2.0f) - (textView.getHeight() / 2.0f)));
                return;
            case 18:
                CameraFragment cameraFragment = (CameraFragment) obj;
                try {
                    C20197i c20197i = cameraFragment.f219051u0;
                    if (c20197i == null) {
                        c20197i = null;
                    }
                    c20197i.f25436v.get();
                    cameraFragment.r5();
                    cameraFragment.u5().accept(InterfaceC44600a.C12165a.f419448a);
                    return;
                } catch (InitializationException e12) {
                    Throwable cause = e12.getCause();
                    if (cause instanceof CameraUnavailableException) {
                        cameraFragment.u5().accept(new InterfaceC44600a.e(((CameraUnavailableException) cause).f23557b));
                        InterfaceC28373a interfaceC28373a = cameraFragment.f219047q0;
                        (interfaceC28373a != null ? interfaceC28373a : null).c(new NonFatalErrorEvent("CameraFragment.handleCameraUnavailableException", cause, null, null, 12, null));
                        return;
                    } else {
                        if (cause instanceof SecurityException) {
                            cameraFragment.u5().accept(new InterfaceC44600a.f(cameraFragment.v5()));
                            return;
                        }
                        cameraFragment.u5().accept(new InterfaceC44600a.e(0));
                        InterfaceC28373a interfaceC28373a2 = cameraFragment.f219047q0;
                        (interfaceC28373a2 != null ? interfaceC28373a2 : null).c(new NonFatalErrorEvent("CameraFragment.handleCameraInitializeException", cause, null, null, 12, null));
                        return;
                    }
                }
            case 19:
                int i22 = com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.e.f221018f;
                ((com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.e) obj).c();
                return;
            case 20:
                ((com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.h) obj).f220938f.fullScroll(66);
                return;
            case 21:
                AppBarLayoutWithIconAction appBarLayoutWithIconAction = ((AddPhoneFragment) obj).f226804o0;
                (appBarLayoutWithIconAction != null ? appBarLayoutWithIconAction : null).setExpanded(true);
                return;
            case 22:
                AppBarLayoutWithIconAction appBarLayoutWithIconAction2 = ((ConfirmPhoneFragment) obj).f226977q0;
                (appBarLayoutWithIconAction2 != null ? appBarLayoutWithIconAction2 : null).setExpanded(true);
                return;
            case 23:
                C35976x4.b(((F) obj).f228550i);
                return;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                j jVar = (j) obj;
                Layout layout = jVar.f229120d.getLayout();
                if (layout != null) {
                    int lineCount = layout.getLineCount();
                    TextView textView2 = jVar.f229121e;
                    if (lineCount <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
                        D6.w(textView2);
                        return;
                    } else {
                        D6.H(textView2);
                        return;
                    }
                }
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((com.avito.android.progress_info_toast_bar.f) obj).b();
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                C33890c c33890c = (C33890c) obj;
                c33890c.f237591b.removeCallbacks(c33890c.f237592c);
                C33745e c33745e = c33890c.f237594e;
                if (c33745e != null) {
                    c33745e.b();
                    return;
                }
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ShadowFrameLayout shadowFrameLayout = ((N0) obj).f237525d;
                if (shadowFrameLayout != null) {
                    D6.G(shadowFrameLayout, true);
                    return;
                }
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((z) obj).f238943e.invoke();
                return;
            default:
                int i23 = com.avito.android.publish.screen.objects.view.actions.b.f240256f;
                com.avito.android.publish.screen.objects.view.actions.b bVar2 = (com.avito.android.publish.screen.objects.view.actions.b) obj;
                bVar2.f240258b.removeCallbacks(bVar2.f240259c);
                InterfaceC33684d interfaceC33684d = bVar2.f240261e;
                if (interfaceC33684d != null) {
                    interfaceC33684d.b();
                    return;
                }
                return;
        }
    }
}

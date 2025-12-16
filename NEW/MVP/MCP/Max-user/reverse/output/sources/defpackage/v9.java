package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public class v9 extends i6c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ v9(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    private final void o(int i) {
    }

    @Override // defpackage.i6c
    public int a() {
        switch (this.a) {
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) this.b;
                x9d x9dVar = messageContextMenuBottomSheet.T0;
                if ((x9dVar == null || x9dVar.c.j() <= 8) && messageContextMenuBottomSheet.R0()) {
                }
                break;
        }
        return 0;
    }

    @Override // defpackage.i6c
    public int c() {
        int measuredHeight;
        View view;
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = AddLinkBottomSheet.B0;
                return ((AddLinkBottomSheet) widget).requireView().getMeasuredHeight() - f().getMeasuredHeight();
            case 1:
                BaseBottomSheetWidget baseBottomSheetWidget = (BaseBottomSheetWidget) widget;
                q85 q85Var = BaseBottomSheetWidget.s0;
                return baseBottomSheetWidget.requireView().getMeasuredHeight() - baseBottomSheetWidget.B0().getMeasuredHeight();
            case 2:
                yy7[] yy7VarArr2 = MediaBarWidget.c1;
                return u45.q(HttpStatus.SC_METHOD_NOT_ALLOWED, vw4.d().getDisplayMetrics().density, ((MediaBarWidget) widget).F0().getMeasuredHeight());
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) widget;
                yy7[] yy7VarArr3 = MessageContextMenuBottomSheet.d1;
                if (messageContextMenuBottomSheet.R0()) {
                    measuredHeight = kti.d(350 * vw4.d().getDisplayMetrics().density);
                    RecyclerView recyclerView = messageContextMenuBottomSheet.S0;
                    mid midVarN = recyclerView != null ? recyclerView.N(Long.MIN_VALUE) : null;
                    int iC = u45.c(120, vw4.d().getDisplayMetrics().density, (midVarN == null || (view = midVarN.a) == null) ? 0 : view.getMeasuredHeight());
                    RecyclerView recyclerView2 = messageContextMenuBottomSheet.S0;
                    int paddingBottom = iC + (recyclerView2 != null ? recyclerView2.getPaddingBottom() : 0);
                    if (paddingBottom >= measuredHeight) {
                        measuredHeight = paddingBottom;
                    }
                } else {
                    View viewF = messageContextMenuBottomSheet.R0;
                    if (viewF == null) {
                        viewF = f();
                    }
                    measuredHeight = viewF.getMeasuredHeight() + messageContextMenuBottomSheet.c1 + messageContextMenuBottomSheet.P0().getPaddingBottom();
                }
                int i2 = xz7.a;
                return xz7.b(xz7.c) ? xz7.a(messageContextMenuBottomSheet.getContext()) + (messageContextMenuBottomSheet.requireView().getMeasuredHeight() - measuredHeight) : messageContextMenuBottomSheet.requireView().getMeasuredHeight() - measuredHeight;
            case 4:
                NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = (NeuroAvatarPickerBottomSheet) widget;
                View view2 = neuroAvatarPickerBottomSheet.getView();
                int height = view2 != null ? view2.getHeight() : Resources.getSystem().getDisplayMetrics().heightPixels;
                hs hsVar = neuroAvatarPickerBottomSheet.C0;
                yy7 yy7Var = NeuroAvatarPickerBottomSheet.N0[1];
                return height - ((Number) hsVar.a(neuroAvatarPickerBottomSheet)).intValue();
            case 5:
                return 0;
            default:
                int iE = e();
                int i3 = iE / 2;
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) widget;
                yy7[] yy7VarArr4 = SuggestionsWidget.F0;
                ypf ypfVar = (ypf) suggestionsWidget.P0().C0.a.getValue();
                mqf mqfVarP0 = suggestionsWidget.P0();
                CharSequence charSequence = (CharSequence) mqfVarP0.F0.getValue();
                ((Number) mqfVarP0.G0.getValue()).intValue();
                if (charSequence == null || vmf.F(charSequence)) {
                    return iE;
                }
                ArrayList arrayList = ypfVar != null ? ypfVar.b : null;
                return (arrayList == null || arrayList.isEmpty()) ? u45.q(48, vw4.d().getDisplayMetrics().density, iE - suggestionsWidget.N0().getMeasuredHeight()) : Math.max(u45.q(20, vw4.d().getDisplayMetrics().density, iE) - suggestionsWidget.O0().getMeasuredHeight(), i3);
        }
    }

    @Override // defpackage.i6c
    public View d() {
        switch (this.a) {
            case 2:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) this.b;
                yy7[] yy7VarArr = MediaBarWidget.c1;
                return mediaBarWidget.D0();
            default:
                return super.d();
        }
    }

    @Override // defpackage.i6c
    public final int e() {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                View view = ((AddLinkBottomSheet) widget).getView();
                if (view != null) {
                    return view.getMeasuredHeight();
                }
                return 0;
            case 1:
                View view2 = ((BaseBottomSheetWidget) widget).getView();
                if (view2 != null) {
                    return view2.getMeasuredHeight();
                }
                return 0;
            case 2:
                yy7[] yy7VarArr = MediaBarWidget.c1;
                return ((MediaBarWidget) widget).F0().getMeasuredHeight();
            case 3:
                View view3 = ((MessageContextMenuBottomSheet) widget).getView();
                if (view3 != null) {
                    return view3.getMeasuredHeight();
                }
                return 0;
            case 4:
                View view4 = ((NeuroAvatarPickerBottomSheet) widget).getView();
                if (view4 != null) {
                    return view4.getMeasuredHeight();
                }
                return 0;
            case 5:
                yy7[] yy7VarArr2 = SelectAlbumWidget.X;
                return -((SelectAlbumWidget) widget).y0().getMeasuredHeight();
            default:
                yy7[] yy7VarArr3 = SuggestionsWidget.F0;
                return ((SuggestionsWidget) widget).B0().getMeasuredHeight();
        }
    }

    @Override // defpackage.i6c
    public final View f() {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = AddLinkBottomSheet.B0;
                return ((AddLinkBottomSheet) widget).B0();
            case 1:
                return ((BaseBottomSheetWidget) widget).B0();
            case 2:
                yy7[] yy7VarArr2 = MediaBarWidget.c1;
                return ((MediaBarWidget) widget).F0();
            case 3:
                yy7[] yy7VarArr3 = MessageContextMenuBottomSheet.d1;
                return ((MessageContextMenuBottomSheet) widget).B0();
            case 4:
                yy7[] yy7VarArr4 = NeuroAvatarPickerBottomSheet.N0;
                return ((NeuroAvatarPickerBottomSheet) widget).B0();
            case 5:
                yy7[] yy7VarArr5 = SelectAlbumWidget.X;
                return ((SelectAlbumWidget) widget).y0();
            default:
                yy7[] yy7VarArr6 = SuggestionsWidget.F0;
                return ((SuggestionsWidget) widget).B0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // defpackage.i6c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.m6c g(defpackage.m6c r6, defpackage.m6c r7) {
        /*
            r5 = this;
            int r0 = r5.a
            one.me.sdk.arch.Widget r1 = r5.b
            m6c r2 = defpackage.m6c.a
            switch(r0) {
                case 1: goto L77;
                case 2: goto L1e;
                case 3: goto L14;
                case 4: goto La;
                default: goto L9;
            }
        L9:
            return r7
        La:
            if (r7 != r2) goto L13
            one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet r1 = (one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet) r1
            yy7[] r6 = one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet.N0
            r1.getClass()
        L13:
            return r7
        L14:
            if (r7 != r2) goto L1d
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r1 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r1
            yy7[] r6 = one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet.d1
            r1.getClass()
        L1d:
            return r7
        L1e:
            one.me.chatscreen.mediabar.MediaBarWidget r1 = (one.me.chatscreen.mediabar.MediaBarWidget) r1
            m6c r0 = defpackage.m6c.c
            if (r7 != r0) goto L37
            yy7[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            mu8 r3 = r1.N0()
            hbd r3 = r3.B0
            mcf r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            d9c r4 = defpackage.d9c.b
            if (r3 != r4) goto L37
            goto L67
        L37:
            if (r6 != r0) goto L54
            m6c r0 = defpackage.m6c.b
            if (r7 != r0) goto L54
            int r0 = defpackage.xz7.a
            int r0 = defpackage.xz7.c
            boolean r0 = defpackage.xz7.b(r0)
            if (r0 != 0) goto L67
            yy7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            ytd r0 = r1.H0()
            boolean r0 = r0.n()
            if (r0 == 0) goto L54
            goto L67
        L54:
            r7.getClass()
            if (r7 == r2) goto L5a
            goto L66
        L5a:
            yy7[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            mu8 r0 = r1.N0()
            boolean r0 = r0.x()
            if (r0 == 0) goto L67
        L66:
            r6 = r7
        L67:
            if (r6 != r2) goto L76
            yy7[] r7 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            mu8 r7 = r1.N0()
            ci5 r7 = r7.x0
            vt8 r0 = defpackage.vt8.a
            defpackage.xfh.r(r7, r0)
        L76:
            return r6
        L77:
            if (r7 != r2) goto L81
            one.me.sdk.bottomsheet.BaseBottomSheetWidget r1 = (one.me.sdk.bottomsheet.BaseBottomSheetWidget) r1
            boolean r0 = r1.D0()
            if (r0 == 0) goto L82
        L81:
            r6 = r7
        L82:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9.g(m6c, m6c):m6c");
    }

    @Override // defpackage.i6c
    public final void h() {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = AddLinkBottomSheet.B0;
                ((AddLinkBottomSheet) widget).I0();
                break;
            case 1:
                BaseBottomSheetWidget baseBottomSheetWidget = (BaseBottomSheetWidget) widget;
                wqi.m(baseBottomSheetWidget.a, "onHidden()", new Object[0]);
                baseBottomSheetWidget.F0();
                break;
            case 2:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) widget;
                yy7[] yy7VarArr2 = MediaBarWidget.c1;
                mediaBarWidget.B0();
                mu8 mu8VarN0 = mediaBarWidget.N0();
                mu8VarN0.u0.g(ys8.a);
                xfh.r(mu8VarN0.x0, ut8.a);
                ChatScreen chatScreen = mediaBarWidget.b1;
                if (chatScreen != null) {
                    chatScreen.d.a();
                    break;
                }
                break;
            case 3:
                yy7[] yy7VarArr3 = MessageContextMenuBottomSheet.d1;
                ((MessageContextMenuBottomSheet) widget).I0();
                break;
            case 4:
                yy7[] yy7VarArr4 = NeuroAvatarPickerBottomSheet.N0;
                ((NeuroAvatarPickerBottomSheet) widget).I0();
                break;
            case 5:
                yy7[] yy7VarArr5 = SelectAlbumWidget.X;
                xfh.r(((SelectAlbumWidget) widget).A0().d, vae.a);
                break;
            default:
                c54 c54Var = (SuggestionsWidget) widget;
                c54Var.getRouter().B(c54Var);
                break;
        }
    }

    @Override // defpackage.i6c
    public void i() {
        switch (this.a) {
            case 2:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) this.b;
                yy7[] yy7VarArr = MediaBarWidget.c1;
                xfh.r(mediaBarWidget.N0().x0, vt8.a);
                break;
        }
    }

    @Override // defpackage.i6c
    public boolean j() {
        switch (this.a) {
            case 2:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) this.b;
                yy7[] yy7VarArr = MediaBarWidget.c1;
                return mediaBarWidget.N0().x();
            default:
                return super.j();
        }
    }

    @Override // defpackage.i6c
    public void k() {
        switch (this.a) {
            case 2:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) this.b;
                yy7[] yy7VarArr = MediaBarWidget.c1;
                mediaBarWidget.C0();
                break;
        }
    }

    @Override // defpackage.i6c
    public void l(m6c m6cVar) {
        switch (this.a) {
            case 6:
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.b;
                bbd bbdVar = suggestionsWidget.x0;
                boolean z = m6cVar == m6c.c;
                yy7[] yy7VarArr = SuggestionsWidget.F0;
                suggestionsWidget.L0().setVisibility(z ? 0 : 8);
                suggestionsWidget.M0().setVisibility(!z ? 0 : 8);
                yf5 yf5VarO0 = suggestionsWidget.O0();
                ViewGroup.LayoutParams layoutParams = yf5VarO0.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = kti.d((z ? 0 : 20) * vw4.d().getDisplayMetrics().density);
                yf5VarO0.setLayoutParams(marginLayoutParams);
                AppCompatTextView appCompatTextViewN0 = suggestionsWidget.N0();
                ViewGroup.LayoutParams layoutParams2 = appCompatTextViewN0.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = kti.d((z ? 0 : 8) * vw4.d().getDisplayMetrics().density);
                appCompatTextViewN0.setLayoutParams(marginLayoutParams2);
                if (z) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) bbdVar.D(suggestionsWidget, SuggestionsWidget.F0[1]);
                    float f = vw4.d().getDisplayMetrics().density * 0.0f;
                    constraintLayout.setClipToOutline(true);
                    constraintLayout.setOutlineProvider(new u74(f));
                    return;
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) bbdVar.D(suggestionsWidget, SuggestionsWidget.F0[1]);
                float f2 = vw4.d().getDisplayMetrics().density * 20.0f;
                constraintLayout2.setClipToOutline(true);
                constraintLayout2.setOutlineProvider(new u74(f2));
                return;
            default:
                return;
        }
    }

    @Override // defpackage.i6c
    public void m(int i) {
        int i2 = this.a;
        Widget widget = this.b;
        switch (i2) {
            case 2:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) widget;
                yy7[] yy7VarArr = MediaBarWidget.c1;
                float f = i;
                float fB = n7j.b(f / kti.d(48 * vw4.d().getDisplayMetrics().density), 0.0f, 1.0f);
                WindowInsets rootWindowInsets = mediaBarWidget.requireView().getRootWindowInsets();
                int i3 = rootWindowInsets != null ? g4i.h(null, rootWindowInsets).a.f(7).b : 0;
                sn0 sn0Var = mediaBarWidget.v0;
                yy7[] yy7VarArr2 = MediaBarWidget.c1;
                yy7 yy7Var = yy7VarArr2[5];
                int measuredHeight = (i3 - ((FrameLayout) sn0Var.getValue()).getMeasuredHeight()) - i;
                if (measuredHeight < 0) {
                    measuredHeight = 0;
                }
                LinearLayout linearLayoutF0 = mediaBarWidget.F0();
                linearLayoutF0.setPadding(linearLayoutF0.getPaddingLeft(), measuredHeight, linearLayoutF0.getPaddingRight(), linearLayoutF0.getPaddingBottom());
                mediaBarWidget.K0.b = 12.0f * fB * vw4.d().getDisplayMetrics().density;
                mediaBarWidget.F0().invalidateOutline();
                sn0 sn0Var2 = mediaBarWidget.u0;
                yy7 yy7Var2 = yy7VarArr2[4];
                ((FrameLayout) sn0Var2.getValue()).setAlpha(fB);
                mediaBarWidget.M0().setShowDropdown(i <= 0);
                mediaBarWidget.E0 = f;
                MediaBarWidget.A0(mediaBarWidget);
                return;
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) widget;
                yy7[] yy7VarArr3 = MessageContextMenuBottomSheet.d1;
                if (messageContextMenuBottomSheet.isAttached() && messageContextMenuBottomSheet.R0()) {
                    float fB2 = n7j.b(i / kti.d(76 * vw4.d().getDisplayMetrics().density), 0.0f, 1.0f);
                    if (fB2 == 1.0f) {
                        messageContextMenuBottomSheet.P0().getMeasuredHeight();
                    }
                    yfb yfbVar = (yfb) messageContextMenuBottomSheet.findViewById(u9b.c);
                    if (yfbVar != null) {
                        float f2 = 1 - fB2;
                        yfbVar.setAlpha(f2);
                        int measuredHeight2 = (int) (f2 * yfbVar.getMeasuredHeight());
                        RecyclerView recyclerView = messageContextMenuBottomSheet.S0;
                        if (recyclerView != null) {
                            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.topMargin = measuredHeight2;
                            recyclerView.setLayoutParams(marginLayoutParams);
                        }
                        ViewGroup viewGroupP0 = messageContextMenuBottomSheet.P0();
                        ViewGroup.LayoutParams layoutParams2 = viewGroupP0.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.topMargin = (int) (messageContextMenuBottomSheet.c1 * fB2);
                        viewGroupP0.setLayoutParams(marginLayoutParams2);
                    }
                    messageContextMenuBottomSheet.b1.b = 20.0f * fB2 * vw4.d().getDisplayMetrics().density;
                    messageContextMenuBottomSheet.P0().invalidateOutline();
                    r35 r35Var = messageContextMenuBottomSheet.x0;
                    if (r35Var != null) {
                        r35Var.setAlpha(fB2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                yy7[] yy7VarArr4 = SelectAlbumWidget.X;
                xfh.r(((SelectAlbumWidget) widget).A0().d, new tae(f().getMeasuredHeight() + i));
                return;
            default:
                return;
        }
    }

    @Override // defpackage.i6c
    public boolean n(m6c m6cVar, float f, float f2) {
        boolean zContains;
        gvf gvfVar;
        RecyclerView recyclerView;
        boolean zCanScrollVertically;
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 2:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) widget;
                yy7[] yy7VarArr = MediaBarWidget.c1;
                if (mediaBarWidget.E0().y0) {
                    return false;
                }
                LinearLayout linearLayoutD0 = mediaBarWidget.D0();
                Rect rect = shh.a;
                shh.d(rect, linearLayoutD0);
                int i2 = (int) f;
                int i3 = (int) f2;
                if (rect.contains(i2, i3)) {
                    return false;
                }
                bcb bcbVar = mediaBarWidget.t0;
                if (bcbVar == null || (gvfVar = (gvf) bcbVar.a.e) == null) {
                    zContains = false;
                } else {
                    shh.d(rect, gvfVar);
                    zContains = rect.contains(i2, i3);
                }
                if (zContains) {
                    return false;
                }
                if (mediaBarWidget.L0().getVisibility() == 0) {
                    return false;
                }
                c54 c54VarB = k8j.b(mediaBarWidget.K0().a);
                MediaGalleryWidget mediaGalleryWidget = c54VarB instanceof MediaGalleryWidget ? (MediaGalleryWidget) c54VarB : null;
                return !(mediaGalleryWidget != null ? mediaGalleryWidget.y0().canScrollVertically(-1) : false);
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) widget;
                x9d x9dVar = messageContextMenuBottomSheet.T0;
                boolean zCanScrollVertically2 = (x9dVar == null || (recyclerView = x9dVar.d) == null) ? false : recyclerView.canScrollVertically(-1);
                RecyclerView recyclerView2 = messageContextMenuBottomSheet.S0;
                return ((recyclerView2 != null ? recyclerView2.canScrollVertically(-1) : false) || zCanScrollVertically2) ? false : true;
            case 4:
                NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = (NeuroAvatarPickerBottomSheet) widget;
                zCanScrollVertically = ((RecyclerView) neuroAvatarPickerBottomSheet.L0.D(neuroAvatarPickerBottomSheet, NeuroAvatarPickerBottomSheet.N0[3])).canScrollVertically(-1);
                break;
            case 5:
                yy7[] yy7VarArr2 = SelectAlbumWidget.X;
                zCanScrollVertically = ((SelectAlbumWidget) widget).y0().canScrollVertically(1);
                break;
            case 6:
                yy7[] yy7VarArr3 = SuggestionsWidget.F0;
                return ((LinearLayoutManager) ((SuggestionsWidget) widget).O0().getLayoutManager()).U0() == 0;
            default:
                return super.n(m6cVar, f, f2);
        }
        return !zCanScrollVertically;
    }
}

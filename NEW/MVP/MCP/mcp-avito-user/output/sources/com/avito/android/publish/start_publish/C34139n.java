package com.avito.android.publish.start_publish;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.analytics.C33536w;
import com.avito.android.publish.drafts.PublishDraftAvailableDialog;
import com.avito.android.publish.start_publish.StartPublishFragment;
import com.avito.android.publish.start_publish.StartPublishSheet;
import com.avito.android.publish.start_publish.StartPublishViewModel;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.DeepLinksDialogInfo;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.PublishStartInfo;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.publish.PublishInitialToast;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: StartPublishFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishViewModel$State;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/start_publish/StartPublishViewModel$State;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.start_publish.n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34139n extends kotlin.jvm.internal.N implements Y41.l<StartPublishViewModel.State, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StartPublishFragment f245428l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34139n(StartPublishFragment startPublishFragment) {
        super(1);
        this.f245428l = startPublishFragment;
    }

    @Override // Y41.l
    public final G0 invoke(StartPublishViewModel.State state) throws Resources.NotFoundException {
        final View viewFindViewById;
        int i12 = 6;
        StartPublishViewModel.State state2 = state;
        boolean z12 = state2 instanceof StartPublishViewModel.State.WizardSheet;
        StartPublishFragment startPublishFragment = this.f245428l;
        if (z12) {
            StartPublishFragment.a aVar = StartPublishFragment.f245287D0;
            startPublishFragment.D5();
            final StartPublishSheet startPublishSheet = startPublishFragment.f245297z0;
            if (startPublishSheet == null || !startPublishSheet.isShowing()) {
                Context contextRequireContext = startPublishFragment.requireContext();
                InterfaceC28373a interfaceC28373a = startPublishFragment.f245294w0;
                if (interfaceC28373a == null) {
                    interfaceC28373a = null;
                }
                C33536w c33536w = startPublishFragment.f245295x0;
                if (c33536w == null) {
                    c33536w = null;
                }
                startPublishSheet = new StartPublishSheet(contextRequireContext, interfaceC28373a, c33536w, new q(startPublishFragment));
                startPublishSheet.f245307M = startPublishFragment;
                com.avito.android.lib.util.g.a(startPublishSheet);
                startPublishSheet.s();
                startPublishFragment.f245297z0 = startPublishSheet;
            }
            if (startPublishSheet.isShowing()) {
                StartPublishSheet.SheetData sheetData = ((StartPublishViewModel.State.WizardSheet) state2).f245339b;
                com.avito.konveyor.adapter.a aVar2 = startPublishSheet.f245303I;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                com.avito.konveyor.util.a.a(aVar2, sheetData.f245308b);
                RecyclerView.Adapter<?> adapter = startPublishSheet.f245302H;
                (adapter != null ? adapter : null).notifyDataSetChanged();
                final PublishInitialToast publishInitialToast = sheetData.f245309c;
                if (publishInitialToast != null && (viewFindViewById = startPublishSheet.findViewById(R.id.toast_container)) != null) {
                    viewFindViewById.post(new Runnable() { // from class: com.avito.android.publish.start_publish.B
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.avito.android.component.toast.f fVarB;
                            String title;
                            String eventId;
                            int i13 = StartPublishSheet.f245298N;
                            PublishInitialToast publishInitialToast2 = publishInitialToast;
                            PublishInitialToast.ClickstreamEvent showEvent = publishInitialToast2.getShowEvent();
                            StartPublishSheet startPublishSheet2 = startPublishSheet;
                            if (showEvent != null && (eventId = showEvent.getEventId()) != null) {
                                startPublishSheet2.f245300F.z0(Integer.parseInt(eventId));
                            }
                            PublishInitialToast.Button button = publishInitialToast2.getButton();
                            List listSingletonList = (button == null || (title = button.getTitle()) == null) ? null : Collections.singletonList(new c.a.C3719a(title, true, null, new D(publishInitialToast2, startPublishSheet2), 4, null));
                            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                            PrintableText printableTextF = com.avito.android.printable_text.b.f(publishInitialToast2.getDescription());
                            ToastBarPosition toastBarPosition = ToastBarPosition.f181045c;
                            if (publishInitialToast2.getType() == PublishInitialToast.Type.DEFAULT) {
                                fVarB = f.a.f125253a;
                            } else {
                                f.c.f125255c.getClass();
                                fVarB = f.c.a.b();
                            }
                            com.avito.android.component.toast.c.b(cVar, viewFindViewById, printableTextF, null, listSingletonList, null, fVarB, 0, toastBarPosition, null, false, false, null, null, 4010);
                        }
                    });
                }
            }
        } else if (state2 instanceof StartPublishViewModel.State.DraftDialog) {
            StartPublishViewModel.State.DraftDialog draftDialog = (StartPublishViewModel.State.DraftDialog) state2;
            String str = draftDialog.f245332b;
            FragmentManager childFragmentManager = startPublishFragment.getChildFragmentManager();
            androidx.fragment.app.H hE2 = childFragmentManager.e();
            Fragment fragmentH = childFragmentManager.H("publish_draft_dialog");
            if (fragmentH != null) {
                hE2.m(fragmentH);
            }
            PublishDraftAvailableDialog.a aVar3 = PublishDraftAvailableDialog.f235328m0;
            Boolean bool = Boolean.TRUE;
            DeepLinksDialogInfo deepLinksDialogInfo = draftDialog.f245333c;
            DeepLinksDialogInfo deepLinksDialogInfoCopy = deepLinksDialogInfo.copy((479 & 1) != 0 ? deepLinksDialogInfo.title : null, (479 & 2) != 0 ? deepLinksDialogInfo.description : null, (479 & 4) != 0 ? deepLinksDialogInfo.items : null, (479 & 8) != 0 ? deepLinksDialogInfo.controlsDirection : null, (479 & 16) != 0 ? deepLinksDialogInfo.isCancellable : null, (479 & 32) != 0 ? deepLinksDialogInfo.shouldShowCloseControl : bool, (479 & 64) != 0 ? deepLinksDialogInfo.imageName : null, (479 & 128) != 0 ? deepLinksDialogInfo.lightThemeImageUrl : null, (479 & 256) != 0 ? deepLinksDialogInfo.darkThemeImageUrl : null);
            aVar3.getClass();
            PublishDraftAvailableDialog publishDraftAvailableDialog = new PublishDraftAvailableDialog();
            com.avito.android.dialog.z.a(publishDraftAvailableDialog, deepLinksDialogInfoCopy, true);
            Bundle arguments = publishDraftAvailableDialog.getArguments();
            if (arguments != null) {
                arguments.putString("key_session_id", str);
            }
            publishDraftAvailableDialog.show(hE2, "publish_draft_dialog");
        } else if (!(state2 instanceof StartPublishViewModel.State.LoadingSheet) && (state2 instanceof StartPublishViewModel.State.ProfilesDialog)) {
            Q1 q12 = startPublishFragment.f245293v0;
            if (q12 == null) {
                q12 = null;
            }
            q12.getClass();
            kotlin.reflect.n<Object> nVar = Q1.f67448x0[89];
            if (((Boolean) q12.f67519w0.a().invoke()).booleanValue()) {
                DialogC34133h dialogC34133h = startPublishFragment.f245288A0;
                if (dialogC34133h == null || !dialogC34133h.isShowing()) {
                    dialogC34133h = new DialogC34133h(startPublishFragment.requireContext(), new p(startPublishFragment));
                    dialogC34133h.f245423M = startPublishFragment;
                    com.avito.android.lib.util.g.a(dialogC34133h);
                    dialogC34133h.s();
                    startPublishFragment.f245288A0 = dialogC34133h;
                }
                if (dialogC34133h.isShowing()) {
                    StartPublishViewModel.State.ProfilesDialog profilesDialog = (StartPublishViewModel.State.ProfilesDialog) state2;
                    String str2 = profilesDialog.f245335b;
                    TextView textView = dialogC34133h.f245416F;
                    if (textView == null) {
                        textView = null;
                    }
                    I5.a(textView, str2, false);
                    ViewGroup viewGroup = dialogC34133h.f245417G;
                    if (viewGroup == null) {
                        viewGroup = null;
                    }
                    PublishStartInfo.MultiProfile.Profile profile = profilesDialog.f245337d;
                    D6.G(viewGroup, profile != null);
                    if (profile != null) {
                        SimpleDraweeView simpleDraweeView = dialogC34133h.f245418H;
                        SimpleDraweeView simpleDraweeView2 = simpleDraweeView == null ? null : simpleDraweeView;
                        Image image = profile.getImage();
                        C35949t5.c(simpleDraweeView2, image != null ? com.avito.android.image_loader.b.b(image) : null, null, null, null, 14);
                        TextView textView2 = dialogC34133h.f245419I;
                        if (textView2 == null) {
                            textView2 = null;
                        }
                        I5.a(textView2, profile.getName(), false);
                        ViewGroup viewGroup2 = dialogC34133h.f245417G;
                        if (viewGroup2 == null) {
                            viewGroup2 = null;
                        }
                        viewGroup2.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(i12, dialogC34133h, profile));
                    }
                    AttributedText attributedText = profilesDialog.f245336c;
                    if (attributedText != null) {
                        dialogC34133h.f245422L.b(attributedText.linkClicksV3().t0(new C34134i(dialogC34133h)));
                    }
                    TextView textView3 = dialogC34133h.f245420J;
                    if (textView3 == null) {
                        textView3 = null;
                    }
                    com.avito.android.util.text.j.a(textView3, attributedText, null);
                    LinearLayout linearLayout = dialogC34133h.f245421K;
                    if (linearLayout == null) {
                        linearLayout = null;
                    }
                    linearLayout.removeAllViews();
                    int i13 = 0;
                    for (Object obj : profilesDialog.f245338e) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        Action action = (Action) obj;
                        boolean z13 = i13 == 0;
                        Button button = new Button(dialogC34133h.getContext(), null, 0, 0);
                        button.setText(action.getTitle());
                        button.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(7, dialogC34133h, action));
                        String style = action.getStyle();
                        boolean zF2 = kotlin.jvm.internal.L.f(style, "primaryLarge");
                        int i15 = R.style.Re23_Button_PrimaryLarge;
                        if (!zF2 && kotlin.jvm.internal.L.f(style, "secondaryLarge")) {
                            i15 = R.style.Re23_Button_SecondaryLarge;
                        }
                        button.setAppearance(i15);
                        LinearLayout linearLayout2 = dialogC34133h.f245421K;
                        if (linearLayout2 == null) {
                            linearLayout2 = null;
                        }
                        linearLayout2.addView(button);
                        if (!z13) {
                            D6.c(button, null, Integer.valueOf(y6.b(6)), null, null, 13);
                        }
                        i13 = i14;
                    }
                }
            } else {
                DialogC34131f dialogC34131f = startPublishFragment.f245289B0;
                if (dialogC34131f == null || !dialogC34131f.isShowing()) {
                    dialogC34131f = new DialogC34131f(startPublishFragment.requireContext(), new o(startPublishFragment));
                    dialogC34131f.f245412M = startPublishFragment;
                    com.avito.android.lib.util.g.a(dialogC34131f);
                    dialogC34131f.s();
                    startPublishFragment.f245289B0 = dialogC34131f;
                }
                if (dialogC34131f.isShowing()) {
                    StartPublishViewModel.State.ProfilesDialog profilesDialog2 = (StartPublishViewModel.State.ProfilesDialog) state2;
                    String str3 = profilesDialog2.f245335b;
                    TextView textView4 = dialogC34131f.f245405F;
                    if (textView4 == null) {
                        textView4 = null;
                    }
                    I5.a(textView4, str3, false);
                    ViewGroup viewGroup3 = dialogC34131f.f245406G;
                    if (viewGroup3 == null) {
                        viewGroup3 = null;
                    }
                    PublishStartInfo.MultiProfile.Profile profile2 = profilesDialog2.f245337d;
                    D6.G(viewGroup3, profile2 != null);
                    if (profile2 != null) {
                        SimpleDraweeView simpleDraweeView3 = dialogC34131f.f245407H;
                        SimpleDraweeView simpleDraweeView4 = simpleDraweeView3 == null ? null : simpleDraweeView3;
                        Image image2 = profile2.getImage();
                        C35949t5.c(simpleDraweeView4, image2 != null ? com.avito.android.image_loader.b.b(image2) : null, null, null, null, 14);
                        TextView textView5 = dialogC34131f.f245408I;
                        if (textView5 == null) {
                            textView5 = null;
                        }
                        I5.a(textView5, profile2.getName(), false);
                        ViewGroup viewGroup4 = dialogC34131f.f245406G;
                        if (viewGroup4 == null) {
                            viewGroup4 = null;
                        }
                        viewGroup4.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(4, dialogC34131f, profile2));
                    }
                    AttributedText attributedText2 = profilesDialog2.f245336c;
                    if (attributedText2 != null) {
                        dialogC34131f.f245411L.b(attributedText2.linkClicksV3().t0(new C34132g(dialogC34131f)));
                    }
                    TextView textView6 = dialogC34131f.f245409J;
                    if (textView6 == null) {
                        textView6 = null;
                    }
                    com.avito.android.util.text.j.a(textView6, attributedText2, null);
                    LinearLayout linearLayout3 = dialogC34131f.f245410K;
                    if (linearLayout3 == null) {
                        linearLayout3 = null;
                    }
                    linearLayout3.removeAllViews();
                    int i16 = 0;
                    for (Object obj2 : profilesDialog2.f245338e) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        Action action2 = (Action) obj2;
                        boolean z14 = i16 > 0;
                        Button button2 = new Button(dialogC34131f.getContext(), null, 0, 0);
                        button2.setText(action2.getTitle());
                        button2.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(5, dialogC34131f, action2));
                        String style2 = action2.getStyle();
                        if (style2 == null) {
                            style2 = "primary";
                        }
                        button2.setAppearanceFromAttr(com.avito.android.lib.util.f.d(style2));
                        LinearLayout linearLayout4 = dialogC34131f.f245410K;
                        if (linearLayout4 == null) {
                            linearLayout4 = null;
                        }
                        linearLayout4.addView(button2, new LinearLayout.LayoutParams(-1, -2, 1.0f));
                        if (z14) {
                            D6.c(button2, null, Integer.valueOf(y6.b(12)), null, null, 13);
                        }
                        i16 = i17;
                    }
                }
            }
        }
        return G0.f406611a;
    }
}

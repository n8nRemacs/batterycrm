package com.avito.android.messenger.conversation.mvi.send;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Fc1.D3;
import android.content.res.Resources;
import com.avito.android.C30277e1;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenu;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SendMessageView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/bottom_sheet/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class X0 extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.bottom_sheet.o, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q0 f194463l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttachMenu f194464m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f194465n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f194466o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Map<Onboarding, OnboardingState> f194467p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f194468q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public X0(Q0 q02, AttachMenu attachMenu, boolean z12, boolean z13, Map<Onboarding, ? extends OnboardingState> map, boolean z14) {
        super(1);
        this.f194463l = q02;
        this.f194464m = attachMenu;
        this.f194465n = z12;
        this.f194466o = z13;
        this.f194467p = map;
        this.f194468q = z14;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(com.avito.android.lib.design.bottom_sheet.o oVar) {
        AttachMenuItem.Replies replies;
        AttachMenuItem.Location location;
        AttachMenuItem.File file;
        AttachMenuItem.Item item;
        AttachMenuItem.Video video;
        AttachMenuItem.Image image;
        com.avito.android.lib.design.bottom_sheet.o oVar2 = oVar;
        Q0 q02 = this.f194463l;
        oVar2.S(q02.f194362O);
        Resources resources = q02.f194372e;
        C30277e1 c30277e1 = q02.f194369b;
        AttachMenu attachMenu = this.f194464m;
        if (attachMenu != null && (image = attachMenu.getImage()) != null) {
            com.avito.android.lib.design.bottom_sheet.o.W(oVar2, c30277e1.w().invoke().booleanValue() ? resources.getString(R.string.messenger_attach_menu_item_photo) : image.getTitle(), Integer.valueOf(R.drawable.ic_messenger_photocamera_24), null, null, null, new R0(q02), 28);
        }
        c30277e1.getClass();
        kotlin.reflect.n<Object>[] nVarArr = C30277e1.f144946d1;
        kotlin.reflect.n<Object> nVar = nVarArr[7];
        if (((Boolean) c30277e1.f145017i.a().invoke()).booleanValue()) {
            kotlin.reflect.n<Object> nVar2 = nVarArr[8];
            if (((Boolean) c30277e1.f145019j.a().invoke()).booleanValue() && attachMenu != null && (video = attachMenu.getVideo()) != null) {
                com.avito.android.lib.design.bottom_sheet.o.W(oVar2, c30277e1.w().invoke().booleanValue() ? resources.getString(R.string.messenger_attach_menu_item_video) : video.getTitle(), Integer.valueOf(R.drawable.ic_messenger_videocamera_24), null, null, null, new S0(q02), 28);
            }
        }
        if (attachMenu == null || (replies = attachMenu.getReplies()) == null) {
            replies = this.f194465n ? new AttachMenuItem.Replies(AttachMenuItem.Replies.DEFAULT_TITLE) : null;
        }
        Map<Onboarding, OnboardingState> map = this.f194467p;
        if (replies != null) {
            com.avito.android.lib.design.bottom_sheet.o.W(oVar2, replies.getTitle(), Integer.valueOf(R.drawable.ic_messenger_quick_reply_24), null, null, (!this.f194466o || map.get(Onboarding.f194328g) == OnboardingState.f194343c) ? null : Integer.valueOf(R.drawable.ic_new_feature_badge), new T0(q02), 12);
        }
        if (attachMenu != null && (item = attachMenu.getItem()) != null) {
            com.avito.android.lib.design.bottom_sheet.o.W(oVar2, item.getTitle(), Integer.valueOf(R.drawable.ic_messenger_rich_24), null, null, null, new U0(q02), 28);
        }
        if (attachMenu != null && (file = attachMenu.getFile()) != null) {
            com.avito.android.lib.design.bottom_sheet.o.W(oVar2, file.getTitle(), Integer.valueOf(R.drawable.ic_messenger_file_24), null, null, (map.get(Onboarding.f194323b) == OnboardingState.f194343c || !this.f194468q) ? null : Integer.valueOf(R.drawable.ic_new_feature_badge), new V0(q02, file), 12);
        }
        if (attachMenu != null && (location = attachMenu.getLocation()) != null) {
            com.avito.android.lib.design.bottom_sheet.o.W(oVar2, location.getTitle(), Integer.valueOf(R.drawable.ic_messenger_user_location), null, null, null, new W0(q02), 28);
        }
        oVar2.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(q02, 24));
        oVar2.setOnCancelListener(new D3(q02, 16));
        com.avito.android.lib.util.g.a(oVar2);
        return kotlin.G0.f406611a;
    }
}

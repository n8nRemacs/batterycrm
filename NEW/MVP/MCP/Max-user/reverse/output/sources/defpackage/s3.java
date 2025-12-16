package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.mediapicker.crop.AvatarEditScreen;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.pinbars.PinBarsWidget;
import one.me.profile.ProfileScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class s3 extends dtf implements um6 {
    public /* synthetic */ Object X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Y = obj;
        this.Z = obj2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                s3 s3Var = new s3((AbstractPickerScreen) this.Z, (Continuation) obj3, 0);
                s3Var.X = (Map) obj;
                s3Var.Y = (Map) obj2;
                return s3Var.n(qqg.a);
            case 1:
                s3 s3Var2 = new s3((ac) this.Z, (Continuation) obj3, 1);
                s3Var2.X = (List) obj;
                s3Var2.Y = (List) obj2;
                return s3Var2.n(qqg.a);
            case 2:
                s3 s3Var3 = new s3((AvatarEditScreen) this.Z, (Continuation) obj3, 2);
                s3Var3.X = (FrameLayout) obj;
                s3Var3.Y = (yeb) obj2;
                qqg qqgVar = qqg.a;
                s3Var3.n(qqgVar);
                return qqgVar;
            case 3:
                s3 s3Var4 = new s3((BaseBottomSheetWidget) this.Z, (Continuation) obj3, 3);
                s3Var4.X = (o6c) obj;
                s3Var4.Y = (yeb) obj2;
                qqg qqgVar2 = qqg.a;
                s3Var4.n(qqgVar2);
                return qqgVar2;
            case 4:
                s3 s3Var5 = new s3((CallLinkInfoScreen) this.Z, (Continuation) obj3, 4);
                s3Var5.X = (CoordinatorLayout) obj;
                s3Var5.Y = (yeb) obj2;
                qqg qqgVar3 = qqg.a;
                s3Var5.n(qqgVar3);
                return qqgVar3;
            case 5:
                s3 s3Var6 = new s3((CallScreen) this.Z, (Continuation) obj3, 5);
                s3Var6.X = (vfh) obj;
                s3Var6.Y = (List) obj2;
                qqg qqgVar4 = qqg.a;
                s3Var6.n(qqgVar4);
                return qqgVar4;
            case 6:
                s3 s3Var7 = new s3((ChatScreen) this.Z, (Continuation) obj3, 6);
                s3Var7.X = (g7e) obj;
                s3Var7.Y = (gy2) obj2;
                return s3Var7.n(qqg.a);
            case 7:
                s3 s3Var8 = new s3((k18) this.Z, (Continuation) obj3, 7);
                s3Var8.X = (pb2) obj;
                s3Var8.Y = (ku3) obj2;
                return s3Var8.n(qqg.a);
            case 8:
                s3 s3Var9 = new s3((k53) this.Z, (Continuation) obj3, 8);
                s3Var9.X = (v03) obj;
                s3Var9.Y = (cpg) obj2;
                return s3Var9.n(qqg.a);
            case 9:
                s3 s3Var10 = new s3((okf) this.Y, (okf) this.Z, (Continuation) obj3, 9);
                s3Var10.X = (RecyclerView) obj;
                qqg qqgVar5 = qqg.a;
                s3Var10.n(qqgVar5);
                return qqgVar5;
            case 10:
                s3 s3Var11 = new s3((ContactListWidget) this.Z, (Continuation) obj3, 10);
                s3Var11.X = (nx3) obj;
                s3Var11.Y = (List) obj2;
                qqg qqgVar6 = qqg.a;
                s3Var11.n(qqgVar6);
                return qqgVar6;
            case 11:
                s3 s3Var12 = new s3((b44) this.Y, (ImageView) this.Z, (Continuation) obj3, 11);
                s3Var12.X = (FrameLayout) obj;
                qqg qqgVar7 = qqg.a;
                s3Var12.n(qqgVar7);
                return qqgVar7;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                s3 s3Var13 = new s3((ExternalCallbackWidget) this.Z, (Continuation) obj3, 12);
                s3Var13.X = (TextView) obj;
                s3Var13.Y = (yeb) obj2;
                qqg qqgVar8 = qqg.a;
                s3Var13.n(qqgVar8);
                return qqgVar8;
            case 13:
                s3 s3Var14 = new s3((ae6) this.Z, (Continuation) obj3, 13);
                s3Var14.X = (List) obj;
                s3Var14.Y = (wb6) obj2;
                return s3Var14.n(qqg.a);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                s3 s3Var15 = new s3((Drawable) this.Z, (Continuation) obj3, 14);
                s3Var15.X = (TextView) obj;
                s3Var15.Y = (yeb) obj2;
                qqg qqgVar9 = qqg.a;
                s3Var15.n(qqgVar9);
                return qqgVar9;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                s3 s3Var16 = new s3((EndlessRecyclerView2) this.Y, (LogsViewerScreen) this.Z, (Continuation) obj3, 15);
                s3Var16.X = (List) obj2;
                qqg qqgVar10 = qqg.a;
                s3Var16.n(qqgVar10);
                return qqgVar10;
            case 16:
                s3 s3Var17 = new s3((Drawable) this.Y, (AppCompatTextView) this.Z, (Continuation) obj3, 16);
                s3Var17.X = (yeb) obj2;
                qqg qqgVar11 = qqg.a;
                s3Var17.n(qqgVar11);
                return qqgVar11;
            case LangUtils.HASH_SEED /* 17 */:
                s3 s3Var18 = new s3((AppCompatTextView) this.Y, (AppCompatTextView) this.Z, (Continuation) obj3, 17);
                s3Var18.X = (yeb) obj2;
                qqg qqgVar12 = qqg.a;
                s3Var18.n(qqgVar12);
                return qqgVar12;
            case 18:
                s3 s3Var19 = new s3((MessageContextMenuBottomSheet) this.Z, (Continuation) obj3, 18);
                s3Var19.X = (FrameLayout) obj;
                s3Var19.Y = (yeb) obj2;
                qqg qqgVar13 = qqg.a;
                s3Var19.n(qqgVar13);
                return qqgVar13;
            case 19:
                s3 s3Var20 = new s3((vu9) this.Z, (Continuation) obj3, 19);
                s3Var20.X = (pb2) obj;
                s3Var20.Y = (hr9) obj2;
                return s3Var20.n(qqg.a);
            case 20:
                s3 s3Var21 = new s3((msb) this.Z, (Continuation) obj3, 20);
                s3Var21.X = (nsb) obj;
                s3Var21.Y = (nsb) obj2;
                qqg qqgVar14 = qqg.a;
                s3Var21.n(qqgVar14);
                return qqgVar14;
            case 21:
                s3 s3Var22 = new s3((wxb) this.Z, (Continuation) obj3, 21);
                s3Var22.X = (v03) obj;
                s3Var22.Y = (List) obj2;
                return s3Var22.n(qqg.a);
            case 22:
                s3 s3Var23 = new s3((fyb) this.Z, (Continuation) obj3, 22);
                s3Var23.X = (List) obj;
                s3Var23.Y = (wb6) obj2;
                return s3Var23.n(qqg.a);
            case 23:
                s3 s3Var24 = new s3((PickerContactsListWidget) this.Z, (Continuation) obj3, 23);
                s3Var24.X = (List) obj;
                s3Var24.Y = (List) obj2;
                qqg qqgVar15 = qqg.a;
                s3Var24.n(qqgVar15);
                return qqgVar15;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                s3 s3Var25 = new s3((PinBarsWidget) this.Z, (Continuation) obj3, 24);
                s3Var25.X = (s0a) obj;
                s3Var25.Y = (yeb) obj2;
                qqg qqgVar16 = qqg.a;
                s3Var25.n(qqgVar16);
                return qqgVar16;
            case 25:
                s3 s3Var26 = new s3((ProfileChangeLinkScreen) this.Z, (Continuation) obj3, 25);
                s3Var26.X = (LinearLayout) obj;
                s3Var26.Y = (yeb) obj2;
                qqg qqgVar17 = qqg.a;
                s3Var26.n(qqgVar17);
                return qqgVar17;
            case 26:
                s3 s3Var27 = new s3((ProfileScreen) this.Z, (Continuation) obj3, 26);
                s3Var27.X = (View) obj;
                s3Var27.Y = (yeb) obj2;
                qqg qqgVar18 = qqg.a;
                s3Var27.n(qqgVar18);
                return qqgVar18;
            case 27:
                s3 s3Var28 = new s3((kgd) this.Z, (Continuation) obj3, 27);
                s3Var28.X = (gn1) obj;
                s3Var28.Y = (Long) obj2;
                return s3Var28.n(qqg.a);
            case 28:
                s3 s3Var29 = new s3((kgd) this.Z, (Continuation) obj3, 28);
                s3Var29.X = (onb) obj;
                s3Var29.Y = (e2e) obj2;
                return s3Var29.n(qqg.a);
            default:
                s3 s3Var30 = new s3((em6) this.Z, (Continuation) obj3, 29);
                s3Var30.X = (AppCompatTextView) obj;
                s3Var30.Y = (yeb) obj2;
                qqg qqgVar19 = qqg.a;
                s3Var30.n(qqgVar19);
                return qqgVar19;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d2 A[LOOP:4: B:77:0x02cc->B:79:0x02d2, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v108, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v110, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v46, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 2466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s3.n(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Z = obj;
    }
}

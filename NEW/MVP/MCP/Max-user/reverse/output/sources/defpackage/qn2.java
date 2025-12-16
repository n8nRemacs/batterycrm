package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.JsonException;
import one.me.android.MainActivity;
import one.me.android.root.RootController;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.edit.FolderEditScreen;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class qn2 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qn2(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        String str;
        uh7 uh7Var;
        String[] strArrNames;
        int i = this.a;
        boolean z = false;
        z = false;
        int i2 = 1;
        qqg qqgVar = qqg.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                xfh.r(((jo2) obj2).P0, new mm2(((w58) ((y58) obj)).a));
                return qqgVar;
            case 1:
                ci5 ci5Var = ((yq2) obj2).V0;
                ko2 ko2Var = ko2.c;
                String str2 = ((w58) ((y58) obj)).a;
                ko2Var.getClass();
                xc0.l(":call-join-preview?link=".concat(str2), ci5Var);
                return qqgVar;
            case 2:
                ChatTitleIconScreen chatTitleIconScreen = (ChatTitleIconScreen) obj2;
                yy7[] yy7VarArr = ChatTitleIconScreen.z0;
                hs hsVar = chatTitleIconScreen.c;
                yy7 yy7Var = ChatTitleIconScreen.z0[0];
                long[] jArr = (long[]) hsVar.a(chatTitleIconScreen);
                Object objA = yvi.a((Bundle) obj, "create_type", raf.class);
                if (objA != null) {
                    return new sz2(jArr, (raf) ((Parcelable) objA));
                }
                throw new IllegalArgumentException(ho7.i("No value passed for key create_type of type ", raf.class.getSimpleName(), " in bundle").toString());
            case 3:
                xfh.r(((k53) obj2).T0, new sxe(((w58) ((y58) obj)).a));
                return qqgVar;
            case 4:
                n8a n8aVar = (n8a) obj;
                ve2 ve2VarI = ((w63) obj2).i();
                ConcurrentHashMap concurrentHashMap = ve2VarI.i;
                if (n8aVar.i()) {
                    return Collections.EMPTY_LIST;
                }
                ve2VarI.p();
                if (concurrentHashMap.isEmpty()) {
                    return Collections.EMPTY_LIST;
                }
                ArrayList arrayList = new ArrayList(n8aVar.d);
                concurrentHashMap.forEach(new se2(n8aVar, z ? 1 : 0, arrayList));
                return arrayList;
            case 5:
                Collection collection = (Collection) obj;
                ve2 ve2VarI2 = ((w63) obj2).i();
                ConcurrentHashMap concurrentHashMap2 = ve2VarI2.i;
                if (collection.isEmpty()) {
                    return Collections.EMPTY_LIST;
                }
                ve2VarI2.p();
                if (concurrentHashMap2.isEmpty()) {
                    return Collections.EMPTY_LIST;
                }
                ArrayList arrayList2 = new ArrayList(collection.size());
                concurrentHashMap2.forEach(new se2(collection, i2, arrayList2));
                return arrayList2;
            case 6:
                ((d92) obj2).invoke(Long.valueOf(((xx3) obj).a));
                return qqgVar;
            case 7:
                ArrayList arrayList3 = new ArrayList(((qv3) ((v6d) obj2).b).k());
                ((v04) ((k18) obj).getValue()).b(arrayList3);
                return arrayList3;
            case 8:
                return d7j.a(((q2b) ((lzf) ((k18) obj).getValue())).b().limitedParallelism(1, "emoji_sprite_loader").plus(((cc5) obj2).c.plus(new c84("EmojiSpriteLoaderScope"))));
            case 9:
                wc5 wc5Var = (wc5) obj2;
                return new cc5(wc5Var.c, wc5Var.b, (k18) obj, wc5Var.a);
            case 10:
                ah5 ah5Var = (ah5) obj2;
                String str3 = (String) obj;
                xg5 xg5Var = ah5Var.b;
                if (xg5Var == null) {
                    Enum[] enumArr = ah5Var.a;
                    xg5Var = new xg5(str3, enumArr.length);
                    for (Enum r0 : enumArr) {
                        xg5Var.k(r0.name(), false);
                    }
                }
                return xg5Var;
            case 11:
                Context context = (Context) obj2;
                zk5 zk5Var = (zk5) obj;
                int i3 = xxg.a;
                try {
                    str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException unused) {
                    str = "?";
                }
                String str4 = Build.VERSION.RELEASE;
                StringBuilder sb = new StringBuilder(u45.f(u45.f(47, str), str4));
                sb.append("ExoPlayer/");
                sb.append(str);
                sb.append(" (Linux;Android ");
                sb.append(str4);
                sb.append(") ExoPlayerLib/2.17.1");
                return new el4(context, sb.toString(), (dk4) zk5Var.b.getValue());
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((jx0) obj2).invoke(Long.valueOf(((bq5) obj).a));
                return qqgVar;
            case 13:
                bq5 bq5Var = (bq5) obj;
                jx0 jx0Var = ((dq5) obj2).F0;
                if (jx0Var != null) {
                    jx0Var.invoke(Long.valueOf(bq5Var.a));
                }
                return qqgVar;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj;
                ((FrameLayout) obj2).removeCallbacks(fakeInAppReviewBottomSheet.J0);
                if (fakeInAppReviewBottomSheet.K0 && (uh7Var = (uh7) qh7.a.getAccessor().f()) != null) {
                    uh7Var.b(4);
                }
                return qqgVar;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                zw5 zw5Var = (zw5) obj2;
                return new ex5(zw5Var.b, zw5Var.a, (bx5) obj);
            case 16:
                long j = ((ha6) obj).a;
                ca6 ca6VarZ0 = ((FolderEditScreen) ((x86) obj2)).z0();
                xfh.o(ca6VarZ0, ((q2b) ca6VarZ0.d).b(), new w96(ca6VarZ0, j, null), 2);
                return qqgVar;
            case LangUtils.HASH_SEED /* 17 */:
                ((ae6) obj2).X.i.remove((wd6) obj);
                return qqgVar;
            case 18:
                ForwardPickerScreen forwardPickerScreen = (ForwardPickerScreen) obj2;
                yy7[] yy7VarArr2 = ForwardPickerScreen.I0;
                ((cg6) forwardPickerScreen.I0().c).h(((ik9) obj).getText(), (Set) forwardPickerScreen.I0().Y.a.getValue(), forwardPickerScreen.O0());
                return qqgVar;
            case 19:
                ForwardPickerScreen forwardPickerScreen2 = (ForwardPickerScreen) obj2;
                yy7[] yy7VarArr3 = ForwardPickerScreen.I0;
                ((cg6) forwardPickerScreen2.I0().c).r.E(4);
                zfi.b((View) obj, ForwardPickerScreen.J0, null);
                forwardPickerScreen2.L0().setLeftIcon(yud.U0);
                return qqgVar;
            case 20:
                ((dh6) obj2).a((String) obj);
                return qqgVar;
            case 21:
                vgb vgbVar = (vgb) obj;
                Iterator it = ((oh6) obj2).b.iterator();
                while (it.hasNext()) {
                    ((dhb) it.next()).c(vgbVar);
                }
                return qqgVar;
            case 22:
                String str5 = (String) obj2;
                uid uidVar = (uid) obj;
                TrafficStats.setThreadStatsTag(str5.hashCode());
                try {
                    ((Socket) uidVar.a).connect(new InetSocketAddress(str5, 443), 3000);
                    return qqgVar;
                } finally {
                    TrafficStats.clearThreadStatsTag();
                }
            case 23:
                ree reeVar = (ree) obj2;
                ew7 ew7Var = (ew7) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                lw7 lw7Var = ew7Var.a;
                mfh.i(ew7Var, reeVar);
                int iF = reeVar.f();
                for (int i4 = 0; i4 < iF; i4++) {
                    List listH = reeVar.h(i4);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : listH) {
                        if (obj3 instanceof gx7) {
                            arrayList4.add(obj3);
                        }
                    }
                    gx7 gx7Var = (gx7) (arrayList4.size() == 1 ? arrayList4.get(0) : null);
                    if (gx7Var != null && (strArrNames = gx7Var.names()) != null) {
                        for (String str6 : strArrNames) {
                            String str7 = fni.a(reeVar.e(), wee.c) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str6)) {
                                throw new JsonException("The suggested name '" + str6 + "' for " + str7 + ' ' + reeVar.g(i4) + " is already one of the names for " + str7 + ' ' + reeVar.g(((Number) to8.c(linkedHashMap, str6)).intValue()) + " in " + reeVar);
                            }
                            linkedHashMap.put(str6, Integer.valueOf(i4));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? id5.a : linkedHashMap;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                Bundle bundle = (Bundle) obj2;
                MainActivity mainActivity = (MainActivity) obj;
                ?? r02 = mainActivity.V0;
                int i5 = MainActivity.a1;
                if (bundle != null && !bundle.isEmpty()) {
                    x21 x21Var = (x21) r02.getValue();
                    Window window = mainActivity.getWindow();
                    eud eudVar = (eud) ((x21) r02.getValue()).a.invoke();
                    c54 c54VarW = eudVar != null ? eudVar.w() : null;
                    ub1 ub1Var = mainActivity.U0;
                    if (ub1Var != null && ub1Var.c()) {
                        z = true;
                    }
                    x21Var.getClass();
                    x21.a(window, null, c54VarW, z);
                }
                t1b t1bVar = t1b.a;
                ytd ytdVarH0 = ((RootController) t1bVar.k().f()).H0();
                oc3 oc3Var = mainActivity.Y0;
                ytdVarH0.a(oc3Var);
                ((RootController) t1bVar.k().f()).G0().a(oc3Var);
                return qqgVar;
            case 25:
                MediaGalleryWidget mediaGalleryWidget = (MediaGalleryWidget) obj;
                yy7[] yy7VarArr4 = MediaGalleryWidget.Y;
                a84 a84Var = (a84) y4e.a.getAccessor().c(84);
                k18 k18VarA = rsb.a.a();
                zy8 zy8Var = zy8.a;
                de8 de8Var = (de8) zy8Var.getAccessor().c(492);
                k18 k18Var = x4e.j;
                Object objA2 = yvi.a((Bundle) obj2, "arg_gallery_mode", xo6.class);
                if (objA2 != null) {
                    return new tq6((xo6) ((Parcelable) objA2), mediaGalleryWidget.getContext(), a84Var, (sd8) zy8Var.getAccessor().c(493), de8Var, x4e.k, k18VarA, k18Var, zy8Var.getAccessor().d(47), mediaGalleryWidget.z0());
                }
                throw new IllegalArgumentException(ho7.i("No value passed for key arg_gallery_mode of type ", xo6.class.getSimpleName(), " in bundle").toString());
            case 26:
                vu2 vu2Var = (vu2) obj;
                wz7 wz7Var = (wz7) ((y09) obj2).d.invoke();
                if (wz7Var != null) {
                    wz7Var.V();
                }
                vu2Var.invoke();
                return qqgVar;
            case 27:
                ik9 ik9Var = (ik9) obj;
                ImageView imageView = new ImageView((Context) obj2);
                imageView.setId(zud.W);
                float f = 28;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                layoutParams.gravity = 80;
                layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ik9Var.a);
                imageView.setLayoutParams(layoutParams);
                imageView.setImageResource(ik9Var.o);
                imageView.setImageTintList(ColorStateList.valueOf(a93.s0.y(imageView).a().k().b.b));
                return imageView;
            case 28:
                return d7j.a(((q2b) ((dn9) obj2).b).b().limitedParallelism(1, "messageViewCountController").plus((x74) ((k18) obj).getValue()));
            default:
                j37 j37Var = (j37) obj2;
                j37 j37Var2 = (j37) obj;
                long a = j37Var.getA();
                long c = j37Var.getC();
                long a2 = j37Var2.getA();
                long c2 = j37Var2.getC();
                StringBuilder sbL = az1.l(a, "insertItems: first:", ":");
                sbL.append(c);
                az1.r(a2, ", last:", ":", sbL);
                sbL.append(c2);
                return sbL.toString();
        }
    }
}

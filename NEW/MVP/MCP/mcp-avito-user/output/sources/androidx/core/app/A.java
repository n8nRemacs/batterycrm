package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.collection.C20203c;
import androidx.core.app.K;
import androidx.core.app.M;
import androidx.core.app.z;
import androidx.core.graphics.drawable.IconCompat;
import com.avito.android.R;
import j.X;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: NotificationCompatBuilder.java */
@RestrictTo
/* loaded from: classes.dex */
class A implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f44470a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f44471b;

    /* renamed from: c, reason: collision with root package name */
    public final z.n f44472c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f44473d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44474e;

    /* compiled from: NotificationCompatBuilder.java */
    @X
    public static class a {
    }

    /* compiled from: NotificationCompatBuilder.java */
    @X
    public static class b {
    }

    /* compiled from: NotificationCompatBuilder.java */
    @X
    public static class c {
    }

    /* compiled from: NotificationCompatBuilder.java */
    @X
    public static class d {
    }

    /* compiled from: NotificationCompatBuilder.java */
    @X
    public static class e {
    }

    /* compiled from: NotificationCompatBuilder.java */
    @X
    public static class f {
        public static void a(Notification.Builder builder, Person person) {
            builder.addPerson(person);
        }

        public static void b(Notification.Action.Builder builder) {
            builder.setSemanticAction(0);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    @X
    public static class g {
        public static void a(Notification.Builder builder, boolean z12) {
            builder.setAllowSystemGeneratedContextualActions(z12);
        }

        public static void b(Notification.Builder builder) {
            builder.setBubbleMetadata(null);
        }

        public static void c(Notification.Action.Builder builder) {
            builder.setContextual(false);
        }

        public static void d(Notification.Builder builder, Object obj) {
            builder.setLocusId((LocusId) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    @X
    public static class h {
        public static void a(Notification.Action.Builder builder) {
            builder.setAuthenticationRequired(false);
        }

        public static void b(Notification.Builder builder, int i12) {
            builder.setForegroundServiceBehavior(i12);
        }
    }

    public A(z.n nVar) {
        Notification notification;
        ArrayList<K> arrayList;
        int i12;
        Bundle[] bundleArr;
        ArrayList<z.b> arrayList2;
        Notification notification2;
        ArrayList<K> arrayList3;
        ArrayList<String> arrayList4;
        String str;
        z.b bVarD;
        int i13;
        A a12 = this;
        new ArrayList();
        a12.f44473d = new Bundle();
        a12.f44472c = nVar;
        Context context = nVar.f44581a;
        a12.f44470a = context;
        Notification.Builder builder = new Notification.Builder(context, nVar.f44603w);
        a12.f44471b = builder;
        Notification notification3 = nVar.f44578B;
        int i14 = 0;
        builder.setWhen(notification3.when).setSmallIcon(notification3.icon, notification3.iconLevel).setContent(notification3.contentView).setTicker(notification3.tickerText, null).setVibrate(notification3.vibrate).setLights(notification3.ledARGB, notification3.ledOnMS, notification3.ledOffMS).setOngoing((notification3.flags & 2) != 0).setOnlyAlertOnce((notification3.flags & 8) != 0).setAutoCancel((notification3.flags & 16) != 0).setDefaults(notification3.defaults).setContentTitle(nVar.f44585e).setContentText(nVar.f44586f).setContentInfo(null).setContentIntent(nVar.f44587g).setDeleteIntent(notification3.deleteIntent).setFullScreenIntent(nVar.f44588h, (notification3.flags & 128) != 0).setNumber(nVar.f44590j).setProgress(0, 0, false);
        IconCompat iconCompat = nVar.f44589i;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.k(context));
        builder.setSubText(null).setUsesChronometer(nVar.f44593m).setPriority(nVar.f44591k);
        z.y yVar = nVar.f44594n;
        if (yVar instanceof z.o) {
            z.o oVar = (z.o) yVar;
            PendingIntent pendingIntent = oVar.f44610g;
            z.b bVarD2 = pendingIntent == null ? oVar.d(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, R.color.call_notification_decline_color, oVar.f44611h) : oVar.d(R.drawable.ic_call_decline, R.string.call_notification_decline_action, R.color.call_notification_decline_color, pendingIntent);
            PendingIntent pendingIntent2 = oVar.f44609f;
            if (pendingIntent2 == null) {
                bVarD = null;
            } else {
                boolean z12 = oVar.f44612i;
                bVarD = oVar.d(z12 ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer, z12 ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList5 = new ArrayList(3);
            arrayList5.add(bVarD2);
            ArrayList<z.b> arrayList6 = oVar.f44623a.f44582b;
            if (arrayList6 != null) {
                Iterator<z.b> it = arrayList6.iterator();
                i13 = 2;
                while (it.hasNext()) {
                    z.b next = it.next();
                    next.getClass();
                    if (!next.f44558a.getBoolean("key_action_priority") && i13 > 1) {
                        arrayList5.add(next);
                        i13--;
                    }
                    if (bVarD != null && i13 == 1) {
                        arrayList5.add(bVarD);
                        i13--;
                    }
                }
            } else {
                i13 = 2;
            }
            if (bVarD != null && i13 >= 1) {
                arrayList5.add(bVarD);
            }
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                a12.b((z.b) it2.next());
            }
        } else {
            Iterator<z.b> it3 = nVar.f44582b.iterator();
            while (it3.hasNext()) {
                a12.b(it3.next());
            }
        }
        Bundle bundle = nVar.f44600t;
        if (bundle != null) {
            a12.f44473d.putAll(bundle);
        }
        int i15 = Build.VERSION.SDK_INT;
        a12.f44471b.setShowWhen(nVar.f44592l);
        a12.f44471b.setLocalOnly(nVar.f44598r);
        a12.f44471b.setGroup(nVar.f44595o);
        a12.f44471b.setSortKey(nVar.f44597q);
        a12.f44471b.setGroupSummary(nVar.f44596p);
        a12.f44474e = 0;
        a12.f44471b.setCategory(nVar.f44599s);
        a12.f44471b.setColor(nVar.f44601u);
        a12.f44471b.setVisibility(nVar.f44602v);
        a12.f44471b.setPublicVersion(null);
        a12.f44471b.setSound(notification3.sound, notification3.audioAttributes);
        ArrayList<String> arrayList7 = nVar.f44580D;
        ArrayList<K> arrayList8 = nVar.f44583c;
        if (i15 < 28) {
            if (arrayList8 == null) {
                arrayList4 = null;
            } else {
                arrayList4 = new ArrayList<>(arrayList8.size());
                Iterator<K> it4 = arrayList8.iterator();
                while (it4.hasNext()) {
                    K next2 = it4.next();
                    next2.getClass();
                    String str2 = next2.f44497a;
                    if (str2 != null) {
                        str = "name:" + ((Object) str2);
                    } else {
                        str = "";
                    }
                    arrayList4.add(str);
                }
            }
            if (arrayList4 != null) {
                if (arrayList7 == null) {
                    arrayList7 = arrayList4;
                } else {
                    C20203c c20203c = new C20203c(arrayList7.size() + arrayList4.size());
                    c20203c.addAll(arrayList4);
                    c20203c.addAll(arrayList7);
                    arrayList7 = new ArrayList<>(c20203c);
                }
            }
        }
        if (arrayList7 != null && !arrayList7.isEmpty()) {
            Iterator<String> it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                a12.f44471b.addPerson(it5.next());
            }
        }
        ArrayList<z.b> arrayList9 = nVar.f44584d;
        if (arrayList9.size() > 0) {
            if (nVar.f44600t == null) {
                nVar.f44600t = new Bundle();
            }
            Bundle bundle2 = nVar.f44600t.getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            int i16 = 0;
            while (i16 < arrayList9.size()) {
                String string = Integer.toString(i16);
                z.b bVar = arrayList9.get(i16);
                Bundle bundle5 = new Bundle();
                IconCompat iconCompatA = bVar.a();
                bundle5.putInt("icon", iconCompatA != null ? iconCompatA.g() : i14);
                bundle5.putCharSequence("title", bVar.f44564g);
                bundle5.putParcelable("actionIntent", bVar.f44565h);
                Bundle bundle6 = bVar.f44558a;
                Bundle bundle7 = bundle6 != null ? new Bundle(bundle6) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", bVar.f44561d);
                bundle5.putBundle("extras", bundle7);
                M[] mArr = bVar.f44560c;
                if (mArr == null) {
                    arrayList2 = arrayList9;
                    notification2 = notification3;
                    arrayList3 = arrayList8;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[mArr.length];
                    arrayList2 = arrayList9;
                    notification2 = notification3;
                    int i17 = 0;
                    while (i17 < mArr.length) {
                        M m12 = mArr[i17];
                        M[] mArr2 = mArr;
                        Bundle bundle8 = new Bundle();
                        ArrayList<K> arrayList10 = arrayList8;
                        bundle8.putString("resultKey", m12.f44504a);
                        bundle8.putCharSequence("label", m12.f44505b);
                        bundle8.putCharSequenceArray("choices", null);
                        bundle8.putBoolean("allowFreeFormInput", m12.f44506c);
                        bundle8.putBundle("extras", m12.f44507d);
                        HashSet hashSet = m12.f44508e;
                        if (hashSet != null && !hashSet.isEmpty()) {
                            ArrayList<String> arrayList11 = new ArrayList<>(hashSet.size());
                            Iterator it6 = hashSet.iterator();
                            while (it6.hasNext()) {
                                arrayList11.add((String) it6.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList11);
                        }
                        bundleArr[i17] = bundle8;
                        i17++;
                        mArr = mArr2;
                        arrayList8 = arrayList10;
                    }
                    arrayList3 = arrayList8;
                }
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", bVar.f44562e);
                bundle5.putInt("semanticAction", 0);
                bundle4.putBundle(string, bundle5);
                i16++;
                i14 = 0;
                arrayList9 = arrayList2;
                notification3 = notification2;
                arrayList8 = arrayList3;
            }
            notification = notification3;
            arrayList = arrayList8;
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            if (nVar.f44600t == null) {
                nVar.f44600t = new Bundle();
            }
            nVar.f44600t.putBundle("android.car.EXTENSIONS", bundle2);
            a12 = this;
            a12.f44473d.putBundle("android.car.EXTENSIONS", bundle3);
        } else {
            notification = notification3;
            arrayList = arrayList8;
        }
        int i18 = Build.VERSION.SDK_INT;
        a12.f44471b.setExtras(nVar.f44600t);
        a12.f44471b.setRemoteInputHistory(null);
        a12.f44471b.setBadgeIconType(0);
        a12.f44471b.setSettingsText(null);
        a12.f44471b.setShortcutId(nVar.f44604x);
        a12.f44471b.setTimeoutAfter(0L);
        a12.f44471b.setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(nVar.f44603w)) {
            a12.f44471b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i18 >= 28) {
            Iterator<K> it7 = arrayList.iterator();
            while (it7.hasNext()) {
                K next3 = it7.next();
                Notification.Builder builder2 = a12.f44471b;
                next3.getClass();
                f.a(builder2, K.b.a(next3));
            }
        }
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 29) {
            g.a(a12.f44471b, nVar.f44577A);
            g.b(a12.f44471b);
            androidx.core.content.h hVar = nVar.f44605y;
            if (hVar != null) {
                g.d(a12.f44471b, hVar.f44630b);
            }
        }
        if (i19 >= 31 && (i12 = nVar.f44606z) != 0) {
            h.b(a12.f44471b, i12);
        }
        if (nVar.f44579C) {
            if (a12.f44472c.f44596p) {
                a12.f44474e = 2;
            } else {
                a12.f44474e = 1;
            }
            a12.f44471b.setVibrate(null);
            a12.f44471b.setSound(null);
            Notification notification4 = notification;
            int i22 = notification4.defaults & (-4);
            notification4.defaults = i22;
            a12.f44471b.setDefaults(i22);
            if (TextUtils.isEmpty(a12.f44472c.f44595o)) {
                a12.f44471b.setGroup("silent");
            }
            a12.f44471b.setGroupAlertBehavior(a12.f44474e);
        }
    }

    @Override // androidx.core.app.w
    public final Notification.Builder a() {
        return this.f44471b;
    }

    public final void b(z.b bVar) {
        IconCompat iconCompatA = bVar.a();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatA != null ? iconCompatA.k(null) : null, bVar.f44564g, bVar.f44565h);
        M[] mArr = bVar.f44560c;
        if (mArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[mArr.length];
            for (int i12 = 0; i12 < mArr.length; i12++) {
                M m12 = mArr[i12];
                RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(m12.f44504a).setLabel(m12.f44505b).setChoices(null).setAllowFreeFormInput(m12.f44506c).addExtras(m12.f44507d);
                HashSet hashSet = m12.f44508e;
                if (hashSet != null) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        builderAddExtras.setAllowDataType((String) it.next(), true);
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    M.d.a(builderAddExtras);
                }
                remoteInputArr[i12] = builderAddExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = bVar.f44558a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z12 = bVar.f44561d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z12);
        int i13 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(z12);
        bundle2.putInt("android.support.action.semanticAction", 0);
        if (i13 >= 28) {
            f.b(builder);
        }
        if (i13 >= 29) {
            g.c(builder);
        }
        if (i13 >= 31) {
            h.a(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", bVar.f44562e);
        builder.addExtras(bundle2);
        this.f44471b.addAction(builder.build());
    }
}

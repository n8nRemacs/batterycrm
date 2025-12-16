package one.me.android.notifications;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import defpackage.aoa;
import defpackage.dnf;
import defpackage.g84;
import defpackage.gf7;
import defpackage.hni;
import defpackage.l42;
import defpackage.mv5;
import defpackage.nv5;
import defpackage.qqg;
import defpackage.r0;
import defpackage.rf7;
import defpackage.tx4;
import defpackage.ty0;
import defpackage.uz9;
import defpackage.wx4;
import defpackage.yna;
import defpackage.yu1;
import defpackage.zk6;
import defpackage.zna;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/android/notifications/NotificationsImagesProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NotificationsImagesProvider extends ContentProvider {
    public static final UriMatcher a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("ru.oneme.app.notifications", "message_image/*/*", 1);
        a = uriMatcher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [ty0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(one.me.android.notifications.NotificationsImagesProvider r6, defpackage.f84 r7, defpackage.c1f r8, defpackage.q44 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.xna
            if (r0 == 0) goto L13
            r0 = r9
            xna r0 = (defpackage.xna) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            xna r0 = new xna
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.Y
            int r1 = r0.s0
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            ty0 r6 = r0.X
            f84 r7 = r0.o
            one.me.android.notifications.NotificationsImagesProvider r8 = r0.d
            defpackage.g8j.b(r9)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L39
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.g8j.b(r9)
        L39:
            boolean r9 = defpackage.d7j.f(r7)
            if (r9 == 0) goto L62
            r6.getClass()
            java.io.File r9 = c(r8)
            if (r9 == 0) goto L4f
            boolean r1 = r9.exists()
            if (r1 == 0) goto L4f
            return r9
        L4f:
            r0.d = r6
            r0.o = r7
            r0.X = r8
            r0.s0 = r2
            r3 = 100
            java.lang.Object r9 = defpackage.s8j.c(r3, r0)
            g84 r1 = defpackage.g84.a
            if (r9 != r1) goto L39
            return r1
        L62:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.android.notifications.NotificationsImagesProvider.a(one.me.android.notifications.NotificationsImagesProvider, f84, c1f, q44):java.lang.Object");
    }

    public static final Object b(NotificationsImagesProvider notificationsImagesProvider, Uri uri, yna ynaVar) {
        l42 l42Var = new l42(1, hni.f(ynaVar));
        l42Var.o();
        r0 r0VarF = zk6.e().f(rf7.a(uri));
        l42Var.e(new zna(r0VarF, 0));
        r0VarF.l(new aoa(l42Var, 0), yu1.a);
        Object objN = l42Var.n();
        return objN == g84.a ? objN : qqg.a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k18] */
    public static File c(ty0 ty0Var) {
        mv5 mv5VarB = ((wx4) ((nv5) ((tx4) gf7.g().d.get()).a.getValue())).b(ty0Var);
        if (!(mv5VarB instanceof mv5)) {
            mv5VarB = null;
        }
        if (mv5VarB != null) {
            return mv5VarB.a;
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String[] getStreamTypes(Uri uri, String str) {
        if (dnf.r(str, "*/", false) || dnf.r(str, "image/", false)) {
            return uz9.b;
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri r8, java.lang.String r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.android.notifications.NotificationsImagesProvider.openFile(android.net.Uri, java.lang.String):android.os.ParcelFileDescriptor");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

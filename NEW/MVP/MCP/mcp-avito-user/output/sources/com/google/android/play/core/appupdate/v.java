package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.C37028k;
import com.google.android.play.core.install.InstallException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
final class v extends t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w f358077q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, C37028k c37028k, String str) {
        super(wVar, new com.google.android.play.core.appupdate.internal.s("OnRequestInstallCallback"), c37028k);
        this.f358077q = wVar;
    }

    @Override // com.google.android.play.core.appupdate.t, com.google.android.play.core.appupdate.internal.n
    public final void k(Bundle bundle) {
        super.k(bundle);
        int i12 = bundle.getInt("error.code", -2);
        C37028k c37028k = this.f358075b;
        if (i12 != 0) {
            c37028k.c(new InstallException(bundle.getInt("error.code", -2)));
            return;
        }
        bundle.getInt("version.code", -1);
        int i13 = bundle.getInt("update.availability");
        int i14 = bundle.getInt("install.status", 0);
        if (bundle.getInt("client.version.staleness", -1) != -1) {
            bundle.getInt("client.version.staleness");
        }
        bundle.getInt("in.app.update.priority", 0);
        bundle.getLong("bytes.downloaded");
        bundle.getLong("total.bytes.to.download");
        long j12 = bundle.getLong("additional.size.required");
        y yVar = this.f358077q.f358083d;
        yVar.getClass();
        long jA2 = y.a(new File(yVar.f358086a.getFilesDir(), "assetpacks"));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap map = new HashMap();
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
        HashSet hashSet = new HashSet();
        if (integerArrayList != null) {
            hashSet.addAll(integerArrayList);
        }
        map.put("blocking.destructive.intent", hashSet);
        ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
        HashSet hashSet2 = new HashSet();
        if (integerArrayList2 != null) {
            hashSet2.addAll(integerArrayList2);
        }
        map.put("nonblocking.destructive.intent", hashSet2);
        ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
        HashSet hashSet3 = new HashSet();
        if (integerArrayList3 != null) {
            hashSet3.addAll(integerArrayList3);
        }
        map.put("blocking.intent", hashSet3);
        ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
        HashSet hashSet4 = new HashSet();
        if (integerArrayList4 != null) {
            hashSet4.addAll(integerArrayList4);
        }
        map.put("nonblocking.intent", hashSet4);
        c37028k.d(new C37094a(i13, i14, j12, jA2, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map));
    }
}

package com.google.mlkit.common.sdkinternal.model;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.util.Log;
import com.google.android.gms.common.internal.C36713l;
import com.google.android.gms.internal.mlkit_common.zznf;
import com.google.android.gms.internal.mlkit_common.zznl;
import com.google.android.gms.internal.mlkit_common.zzsj;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.android.gms.internal.mlkit_common.zzst;
import com.google.android.gms.internal.mlkit_common.zzsu;
import com.google.android.gms.internal.mlkit_common.zzsv;
import com.google.android.gms.tasks.C37028k;
import com.google.mlkit.common.MlKitException;
import j.l0;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@l0
/* loaded from: classes6.dex */
final class p extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final long f362370a;

    /* renamed from: b, reason: collision with root package name */
    public final C37028k f362371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f362372c;

    public /* synthetic */ p(f fVar, long j12, C37028k c37028k, o oVar) {
        this.f362372c = fVar;
        this.f362370a = j12;
        this.f362371b = c37028k;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int columnIndex;
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        if (longExtra != this.f362370a) {
            return;
        }
        f fVar = this.f362372c;
        Integer numB = fVar.b();
        synchronized (fVar) {
            try {
                this.f362372c.f362355c.b().unregisterReceiver(this);
            } catch (IllegalArgumentException unused) {
                C36713l c36713l = f.f362351l;
                if (Log.isLoggable(c36713l.f349447a, 5)) {
                    c36713l.d("Exception thrown while trying to unregister the broadcast receiver for the download");
                }
            }
            this.f362372c.f362353a.remove(this.f362370a);
            this.f362372c.f362354b.remove(this.f362370a);
        }
        if (numB != null) {
            if (numB.intValue() == 16) {
                f fVar2 = this.f362372c;
                zzss zzssVar = fVar2.f362359g;
                zzsj zzsjVarZzg = zzsv.zzg();
                NZ0.d dVar = fVar2.f362357e;
                Long lValueOf = Long.valueOf(longExtra);
                DownloadManager downloadManager = fVar2.f362356d;
                Cursor cursorQuery = downloadManager != null ? downloadManager.query(new DownloadManager.Query().setFilterById(longExtra)) : null;
                zzssVar.zze(zzsjVarZzg, dVar, false, (cursorQuery == null || !cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("reason")) == -1) ? 0 : cursorQuery.getInt(columnIndex));
                this.f362371b.a(this.f362372c.g(lValueOf));
                return;
            }
            if (numB.intValue() == 8) {
                f fVar3 = this.f362372c;
                zzss zzssVar2 = fVar3.f362359g;
                zzsj zzsjVarZzg2 = zzsv.zzg();
                NZ0.d dVar2 = fVar3.f362357e;
                zzst zzstVarZzh = zzsu.zzh();
                zzstVarZzh.zzb(zznf.NO_ERROR);
                zzstVarZzh.zze(true);
                zzstVarZzh.zzd(this.f362372c.f362357e.f11600b);
                zzstVarZzh.zza(zznl.SUCCEEDED);
                zzssVar2.zzg(zzsjVarZzg2, dVar2, zzstVarZzh.zzh());
                this.f362371b.b(null);
                return;
            }
        }
        f fVar4 = this.f362372c;
        fVar4.f362359g.zze(zzsv.zzg(), fVar4.f362357e, false, 0);
        this.f362371b.a(new MlKitException("Model downloading failed", 13));
    }
}

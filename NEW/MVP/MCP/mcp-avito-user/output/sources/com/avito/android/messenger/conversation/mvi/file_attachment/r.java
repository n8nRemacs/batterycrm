package com.avito.android.messenger.conversation.mvi.file_attachment;

import android.content.Context;
import android.content.UriPermission;
import com.avito.android.C30277e1;
import com.avito.android.util.C35836l1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class r implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f190731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f190732c;

    public /* synthetic */ r(t tVar, int i12) {
        this.f190731b = i12;
        this.f190732c = tVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws NumberFormatException {
        t tVar = this.f190732c;
        switch (this.f190731b) {
            case 0:
                int i12 = t.f190736j;
                File file = new File(tVar.f190737a.getFilesDir(), "messenger_persisted_file_upload_cache");
                C35836l1.a(file);
                return File.createTempFile("file-", null, file);
            case 1:
                Context context = tVar.f190737a;
                List<UriPermission> persistedUriPermissions = context.getContentResolver().getPersistedUriPermissions();
                C30277e1 c30277e1 = tVar.f190738b;
                c30277e1.getClass();
                kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[19];
                int i13 = Integer.parseInt((String) c30277e1.f145041u.a().invoke());
                if (persistedUriPermissions.size() > i13) {
                    Iterator it = C42745f0.B0(persistedUriPermissions, new w()).subList(0, persistedUriPermissions.size() - i13).iterator();
                    while (it.hasNext()) {
                        context.getContentResolver().releasePersistableUriPermission(((UriPermission) it.next()).getUri(), 1);
                    }
                }
                return G0.f406611a;
            case 2:
                int i14 = t.f190736j;
                File file2 = new File(tVar.f190737a.getFilesDir(), "messenger_persisted_file_upload_cache");
                C35836l1.a(file2);
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles == null) {
                    return C42784z0.f406748b;
                }
                ArrayList arrayList = new ArrayList();
                for (File file3 : fileArrListFiles) {
                    if (file3.isFile()) {
                        arrayList.add(file3);
                    }
                }
                return arrayList;
            case 3:
                int i15 = t.f190736j;
                return Boolean.valueOf(kotlin.io.j.c((File) tVar.f190739c.getValue()));
            default:
                int i16 = t.f190736j;
                File file4 = new File(tVar.f190737a.getFilesDir(), "messenger_file_download_cache");
                C35836l1.a(file4);
                return File.createTempFile("file-", null, file4);
        }
    }
}

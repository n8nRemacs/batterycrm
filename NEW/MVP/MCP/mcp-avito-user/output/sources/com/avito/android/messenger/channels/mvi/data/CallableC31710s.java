package com.avito.android.messenger.channels.mvi.data;

import Oq.InterfaceC14725a;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import arrow.core.Z0;
import com.avito.android.messenger.conversation.mvi.data.C32016e;
import com.avito.android.messenger.conversation.mvi.data.MessengerDbException;
import com.avito.android.remote.model.User;
import com.avito.android.util.C35836l1;
import com.avito.android.util.X2;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.channels.mvi.data.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class CallableC31710s implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f187244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f187245c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f187246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f187247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f187248f;

    public /* synthetic */ CallableC31710s(int i12, String str, Object obj, Object obj2, Object obj3) {
        this.f187244b = i12;
        this.f187247e = obj;
        this.f187245c = obj2;
        this.f187246d = str;
        this.f187248f = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        Uri uriA;
        switch (this.f187244b) {
            case 0:
                MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) this.f187245c;
                ((C31714w) this.f187247e).f187255a.b(com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), messengerUserHashInfo.f430682d, this.f187246d, (String) this.f187248f);
                return G0.f406611a;
            case 1:
                ArrayList arrayList = (ArrayList) this.f187247e;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    g0 g0Var = (g0) this.f187248f;
                    if (!zHasNext) {
                        return g0Var.f187224a.f(arrayList2);
                    }
                    arrayList2.add(g0Var.f187225b.a((MessengerUserHashInfo) this.f187245c, this.f187246d, (User) it.next()));
                }
            case 2:
                C32016e c32016e = (C32016e) this.f187247e;
                Throwable th2 = (Throwable) this.f187245c;
                String str = this.f187246d;
                Map map = (Map) this.f187248f;
                boolean z12 = (th2 instanceof SQLiteDatabaseCorruptException) || (th2.getCause() instanceof SQLiteDatabaseCorruptException);
                X2.f318778a.i("DatabaseErrorHandler", "Handling error for method = " + str + ", isCorrupt = " + z12, th2);
                String f54516c = c32016e.f190461b.i().getF54516c();
                if (f54516c == null) {
                    throw th2;
                }
                com.avito.android.messenger.util.d dVar = new com.avito.android.messenger.util.d(c32016e.f190460a, f54516c);
                LinkedHashMap linkedHashMapA = dVar.a(dVar.f197434a);
                if (dVar.f197435b) {
                    InterfaceC14725a.C0808a.a(c32016e.f190463d, new MessengerDbException("Failed to perform DB query", th2, dVar.f197436c), P0.k(P0.k(P0.g(new kotlin.Q("method", str), new kotlin.Q("database.isOpen", Boolean.valueOf(c32016e.f190461b.n()))), map), linkedHashMapA), 2);
                }
                if (dVar.f197436c) {
                    throw th2;
                }
                return Boolean.TRUE;
            case 3:
                int i12 = Build.VERSION.SDK_INT;
                com.avito.android.messenger.conversation.mvi.file_attachment.t tVar = (com.avito.android.messenger.conversation.mvi.file_attachment.t) this.f187247e;
                Context context = tVar.f190737a;
                String str2 = this.f187246d;
                File file = (File) this.f187245c;
                if (i12 >= 29) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", str2);
                    contentValues.put("mime_type", (String) this.f187248f);
                    contentValues.put("_size", Long.valueOf(C35836l1.c(file)));
                    uriA = context.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                } else {
                    uriA = tVar.A(com.avito.android.messenger.conversation.mvi.file_attachment.t.y((File) tVar.f190743g.getValue(), str2));
                }
                if (uriA != null) {
                    OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriA);
                    try {
                        byte[] bArr = new byte[1024];
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file.getAbsoluteFile()));
                        while (true) {
                            int i13 = bufferedInputStream.read(bArr, 0, 1024);
                            if (i13 == -1) {
                                if (outputStreamOpenOutputStream != null) {
                                    outputStreamOpenOutputStream.flush();
                                }
                                bufferedInputStream.close();
                                G0 g02 = G0.f406611a;
                                kotlin.io.c.a(outputStreamOpenOutputStream, null);
                            } else if (outputStreamOpenOutputStream != null) {
                                outputStreamOpenOutputStream.write(bArr, 0, i13);
                            }
                        }
                    } finally {
                    }
                } else {
                    uriA = null;
                }
                return Z0.b(uriA);
            default:
                ((com.avito.android.messenger.conversation.mvi.sync.P) this.f187247e).f194642j.C6((MessengerUserHashInfo) this.f187245c, this.f187246d, (List) this.f187248f);
                return G0.f406611a;
        }
    }

    public /* synthetic */ CallableC31710s(com.avito.android.messenger.conversation.mvi.file_attachment.t tVar, String str, String str2, File file) {
        this.f187244b = 3;
        this.f187247e = tVar;
        this.f187246d = str;
        this.f187248f = str2;
        this.f187245c = file;
    }

    public /* synthetic */ CallableC31710s(ArrayList arrayList, g0 g0Var, MessengerUserHashInfo messengerUserHashInfo, String str) {
        this.f187244b = 1;
        this.f187247e = arrayList;
        this.f187248f = g0Var;
        this.f187245c = messengerUserHashInfo;
        this.f187246d = str;
    }
}

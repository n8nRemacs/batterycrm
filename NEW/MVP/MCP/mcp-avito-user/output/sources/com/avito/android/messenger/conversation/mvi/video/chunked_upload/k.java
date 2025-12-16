package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import androidx.compose.runtime.C22026a;
import androidx.work.C23544h;
import androidx.work.F;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.video.chunked_upload.o;
import com.avito.android.util.V2;
import kotlin.Q;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class k implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f194949b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.b f194950c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f194951d;

    public /* synthetic */ k(AbstractC32094s0.b bVar, Object obj, int i12) {
        this.f194949b = i12;
        this.f194950c = bVar;
        this.f194951d = obj;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Object obj2 = this.f194951d;
        AbstractC32094s0.b bVar = this.f194950c;
        Throwable th2 = (Throwable) obj;
        switch (this.f194949b) {
            case 0:
                V2 v22 = V2.f318762a;
                StringBuilder sb2 = new StringBuilder("Upload failed for message(");
                sb2.append(com.avito.android.messenger.util.i.b(bVar.f191222b, new Q[0]));
                sb2.append(", channelId=");
                sb2.append(bVar.f191223c);
                sb2.append(", localMessageId = ");
                v22.a("ChunkedVideoUploadWorker", C22026a.c(sb2, bVar.f191221a, ')'), th2);
                String string = th2.toString();
                int length = string.length() - 1;
                if (length > 2048) {
                    length = 2048;
                }
                String strSubstring = string.substring(0, length);
                C23544h.a aVar = new C23544h.a();
                aVar.b(((ChunkedVideoUploadWorker) obj2).getInputData().f55510a);
                aVar.f55511a.put("keyError", strSubstring);
                return new F.a.C1949a(aVar.a());
            default:
                int i12 = o.f194952f;
                return new o.b.a(bVar, (String) obj2, th2);
        }
    }
}

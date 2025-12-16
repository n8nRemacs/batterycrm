package com.avito.android.messenger.conversation.mvi.file_attachment;

import com.avito.android.util.C35836l1;
import com.avito.android.util.C5;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.text.C43066x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class q implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f190728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f190729c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190730d;

    public /* synthetic */ q(t tVar, String str, int i12) {
        this.f190728b = i12;
        this.f190729c = tVar;
        this.f190730d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f190730d;
        t tVar = this.f190729c;
        switch (this.f190728b) {
            case 0:
                int i12 = t.f190736j;
                if (C43066x.h0(str, C5.c(((File) tVar.f190740d.getValue()).getPath()), false)) {
                    return new File(str);
                }
                throw new IllegalArgumentException("Given uri points to a file not from /messenger_persisted_file_upload_cache/ directory");
            case 1:
                int i13 = t.f190736j;
                if (C43066x.h0(str, C5.c(((File) tVar.f190740d.getValue()).getPath()), false)) {
                    return Boolean.valueOf(new File(str).delete());
                }
                throw new IllegalArgumentException("Given uri points to a file not from /messenger_persisted_file_upload_cache/ directory");
            case 2:
                int i14 = t.f190736j;
                C35836l1.a((File) tVar.f190742f.getValue());
                return t.y((File) tVar.f190742f.getValue(), str);
            case 3:
                int i15 = t.f190736j;
                if (C43066x.h0(str, C5.c(((File) tVar.f190741e.getValue()).getPath()), false)) {
                    return Boolean.valueOf(new File(str).delete());
                }
                throw new IllegalArgumentException("Given uri points to a file not from /messenger_file_download_cache/ directory");
            case 4:
                int i16 = t.f190736j;
                if (C43066x.h0(str, C5.c(((File) tVar.f190742f.getValue()).getPath()), false)) {
                    return Boolean.valueOf(new File(str).delete());
                }
                throw new IllegalArgumentException("Given uri points to a file not from /messenger_voice_file_cache/ directory");
            default:
                int i17 = t.f190736j;
                if (C43066x.h0(str, C5.c(((File) tVar.f190739c.getValue()).getPath()), false)) {
                    return Boolean.valueOf(new File(str).delete());
                }
                throw new IllegalArgumentException("Given uri points to a file not from /messenger_file_upload_cache/ directory");
        }
    }
}

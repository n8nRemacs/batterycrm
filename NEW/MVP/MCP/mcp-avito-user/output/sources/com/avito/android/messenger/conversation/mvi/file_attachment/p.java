package com.avito.android.messenger.conversation.mvi.file_attachment;

import arrow.core.Z0;
import com.avito.android.util.J;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class p implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f190725b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f190726c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f190727d;

    public /* synthetic */ p(t tVar, File file) {
        this.f190727d = tVar;
        this.f190726c = file;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        File file = this.f190726c;
        t tVar = this.f190727d;
        switch (this.f190725b) {
            case 0:
                int i12 = t.f190736j;
                return Z0.b(tVar.A(file));
            default:
                int i13 = t.f190736j;
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArrC = kotlin.io.b.c(fileInputStream);
                    tVar.getClass();
                    String strA = J.a(MessageDigest.getInstance("SHA-256").digest(bArrC));
                    kotlin.io.c.a(fileInputStream, null);
                    return strA;
                } finally {
                }
        }
    }

    public /* synthetic */ p(File file, t tVar) {
        this.f190726c = file;
        this.f190727d = tVar;
    }
}

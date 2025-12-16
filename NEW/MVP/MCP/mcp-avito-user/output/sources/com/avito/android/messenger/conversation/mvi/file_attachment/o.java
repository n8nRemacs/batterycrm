package com.avito.android.messenger.conversation.mvi.file_attachment;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.avito.android.util.C35836l1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class o implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f190722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f190723c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f190724d;

    public /* synthetic */ o(t tVar, Uri uri, int i12) {
        this.f190722b = i12;
        this.f190723c = tVar;
        this.f190724d = uri;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        Uri uri = this.f190724d;
        t tVar = this.f190723c;
        switch (this.f190722b) {
            case 0:
                int i12 = t.f190736j;
                C35836l1.a((File) tVar.f190740d.getValue());
                File fileCreateTempFile = File.createTempFile("file-", null, (File) tVar.f190740d.getValue());
                parcelFileDescriptorOpenFileDescriptor = tVar.f190737a.getContentResolver().openFileDescriptor(uri, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    throw new IllegalStateException(androidx.appcompat.app.r.n(uri, "Can't get file descriptor "));
                }
                try {
                    fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        try {
                            kotlin.io.b.a(fileInputStream, fileOutputStream, 1024);
                            kotlin.io.c.a(fileOutputStream, null);
                            kotlin.io.c.a(fileInputStream, null);
                            kotlin.io.c.a(parcelFileDescriptorOpenFileDescriptor, null);
                            return fileCreateTempFile;
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 1:
                int i13 = t.f190736j;
                C35836l1.a((File) tVar.f190739c.getValue());
                File fileCreateTempFile2 = File.createTempFile("file-", null, (File) tVar.f190739c.getValue());
                parcelFileDescriptorOpenFileDescriptor = tVar.f190737a.getContentResolver().openFileDescriptor(uri, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    throw new IllegalStateException(androidx.appcompat.app.r.n(uri, "Can't get file descriptor "));
                }
                try {
                    fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        fileOutputStream = new FileOutputStream(fileCreateTempFile2);
                        try {
                            kotlin.io.b.a(fileInputStream, fileOutputStream, 1024);
                            kotlin.io.c.a(fileOutputStream, null);
                            kotlin.io.c.a(fileInputStream, null);
                            kotlin.io.c.a(parcelFileDescriptorOpenFileDescriptor, null);
                            return fileCreateTempFile2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            default:
                tVar.f190737a.getContentResolver().releasePersistableUriPermission(uri, 1);
                return G0.f406611a;
        }
    }
}

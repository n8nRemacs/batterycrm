package com.avito.android.mortgage.sign.files;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Environment;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.C35836l1;
import java.io.File;
import java.io.IOException;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.io.j;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SignStorage.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sign/files/d;", "Lcom/avito/android/mortgage/sign/files/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f203653a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f203654b = C42727D.c(new a());

    /* compiled from: SignStorage.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<File> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final File invoke() {
            File file = new File(d.this.f203653a.getCacheDir(), "mortgage-sign-cache");
            C35836l1.a(file);
            return file;
        }
    }

    @Inject
    public d(@k Context context) {
        this.f203653a = context;
    }

    @Override // com.avito.android.mortgage.sign.files.c
    @l
    public final File a(@k String str) throws IOException {
        if (!L.f(Environment.getExternalStorageState(), "mounted")) {
            return null;
        }
        File fileCreateTempFile = File.createTempFile("sign", ".svg", (File) this.f203654b.getValue());
        if (!fileCreateTempFile.canWrite()) {
            fileCreateTempFile = null;
        }
        if (fileCreateTempFile == null) {
            return null;
        }
        j.f(fileCreateTempFile, str);
        return fileCreateTempFile;
    }
}

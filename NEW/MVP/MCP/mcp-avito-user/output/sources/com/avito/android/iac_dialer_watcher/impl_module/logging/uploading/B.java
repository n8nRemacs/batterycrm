package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;

/* compiled from: IacLogFileWriter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/b;", "lines", "Ljava/io/File;", "apply", "(Ljava/util/List;)Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class B<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f167949b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a f167950c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w f167951d;

    public B(D d12, com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a aVar, com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar) {
        this.f167949b = d12;
        this.f167950c = aVar;
        this.f167951d = wVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        D d12 = this.f167949b;
        com.avito.android.iac_dialer_watcher.impl_module.logging.a aVar = d12.f167953a;
        com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a aVar2 = this.f167950c;
        File fileA = aVar.a(aVar2);
        com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar = this.f167951d;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), C43047d.f410589b), 8192);
        try {
            bufferedWriter.write(aVar2.f167900h);
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write(wVar.f167938c);
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                bufferedWriter.write(D.b(d12, ((com.avito.android.iac_dialer_watcher.impl_module.logging.repository.b) it.next()).f167903c));
                bufferedWriter.newLine();
            }
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacLogFileWriter", "Log file was created and filled: " + fileA.getName(), null);
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(bufferedWriter, null);
            return fileA;
        } finally {
        }
    }
}

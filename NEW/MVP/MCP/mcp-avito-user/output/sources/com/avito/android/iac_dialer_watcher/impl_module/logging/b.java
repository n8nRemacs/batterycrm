package com.avito.android.iac_dialer_watcher.impl_module.logging;

import android.content.Context;
import com.avito.android.util.C35836l1;
import com.squareup.anvil.annotations.ContributesBinding;
import java.io.File;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;

/* compiled from: IacLogFileProvider.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/b;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/a;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements com.avito.android.iac_dialer_watcher.impl_module.logging.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f167873a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f167874b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f167875c = C42727D.c(new a());

    /* compiled from: IacLogFileProvider.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<File> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final File invoke() {
            File filesDir = b.this.f167873a.getFilesDir();
            C35836l1.a(filesDir);
            return new File(filesDir, "logs/iac3");
        }
    }

    @Inject
    public b(@Y61.k Context context, @Y61.k com.avito.android.server_time.f fVar) {
        this.f167873a = context;
        this.f167874b = fVar;
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.a
    @Y61.k
    public final File a(@Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a aVar) throws IOException {
        InterfaceC42726C interfaceC42726C = this.f167875c;
        ((File) interfaceC42726C.getValue()).mkdirs();
        File file = new File((File) interfaceC42726C.getValue(), androidx.appcompat.app.r.q(aVar.f167895c + "_file" + this.f167874b.now() + "_session" + aVar.f167893a + "_index" + aVar.f167894b + '_' + new C43059p("\\W").f(aVar.f167896d, ""), ".log"));
        file.createNewFile();
        return file;
    }
}

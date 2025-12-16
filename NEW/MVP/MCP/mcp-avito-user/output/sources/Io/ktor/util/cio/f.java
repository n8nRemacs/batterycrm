package io.ktor.util.cio;

import io.ktor.utils.io.C41714z1;
import io.ktor.utils.io.W0;
import java.io.File;
import kotlin.Metadata;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.S;
import kotlinx.coroutines.U;

/* compiled from: FileChannels.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f {
    public static W0 a(File file) {
        kotlinx.coroutines.scheduling.b bVar = C43262l0.f411947c;
        return C41714z1.b(U.a(bVar), new S("file-reader").plus(bVar), false, new d(file.length(), file, null)).x();
    }
}

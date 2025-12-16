package io.noties.markwon.html;

import io.noties.markwon.C;
import j.N;
import java.io.IOException;

/* compiled from: AppendableUtils.java */
/* loaded from: classes8.dex */
abstract class a {
    public static void a(@N C c12, char c13) throws IOException {
        try {
            c12.append(c13);
        } catch (IOException e12) {
            throw new RuntimeException(e12);
        }
    }
}

package org.jsoup;

import AK.c;
import java.io.IOException;

/* loaded from: classes7.dex */
public class HttpStatusException extends IOException {
    @Override // java.lang.Throwable
    public final String toString() {
        return c.s(new StringBuilder(), super.toString(), ". Status=0, URL=null");
    }
}

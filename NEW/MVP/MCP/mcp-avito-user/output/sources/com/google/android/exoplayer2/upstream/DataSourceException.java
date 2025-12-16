package com.google.android.exoplayer2.upstream;

import j.P;
import java.io.IOException;

/* loaded from: classes6.dex */
public class DataSourceException extends IOException {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f347726c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f347727b;

    public DataSourceException(int i12) {
        this.f347727b = i12;
    }

    public DataSourceException(@P Exception exc, int i12) {
        super(exc);
        this.f347727b = i12;
    }

    public DataSourceException(@P String str, int i12) {
        super(str);
        this.f347727b = i12;
    }

    public DataSourceException(int i12, @P String str, @P Exception exc) {
        super(str, exc);
        this.f347727b = i12;
    }
}

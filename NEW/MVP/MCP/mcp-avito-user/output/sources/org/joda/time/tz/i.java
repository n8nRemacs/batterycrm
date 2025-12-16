package org.joda.time.tz;

/* compiled from: ZoneInfoLogger.java */
/* loaded from: classes7.dex */
public class i {

    /* compiled from: ZoneInfoLogger.java */
    public static class a extends ThreadLocal<Boolean> {
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ Boolean initialValue() {
            return Boolean.FALSE;
        }
    }

    static {
        new a();
    }
}

package com.avito.android.util;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: ByteArrays.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_lang_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class J {

    /* compiled from: ByteArrays.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "eachByte", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Byte, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f318633l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(Byte b12) {
            return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b12.byteValue())}, 1));
        }
    }

    @Y61.k
    public static final String a(@Y61.k byte[] bArr) {
        return C42756l.N(bArr, a.f318633l);
    }
}

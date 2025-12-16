package com.avito.android.remote.parse.adapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.s0;

/* compiled from: EmptyStringOnLongAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/EmptyStringOnLongAdapter;", "Lcom/google/gson/TypeAdapter;", "", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EmptyStringOnLongAdapter extends TypeAdapter<Long> {

    /* compiled from: EmptyStringOnLongAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f254174a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f254174a = iArr;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Long read(com.google.gson.stream.a aVar) {
        Object bVar;
        JsonToken jsonTokenF = aVar.F();
        int i12 = jsonTokenF == null ? -1 : a.f254174a[jsonTokenF.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                return null;
            }
            return Long.valueOf(aVar.u());
        }
        try {
            int i13 = kotlin.Z.f406624c;
            String strB = aVar.B();
            bVar = strB != null ? Long.valueOf(Long.parseLong(strB)) : null;
        } catch (Throwable th2) {
            int i14 = kotlin.Z.f406624c;
            bVar = new Z.b(th2);
        }
        return (Long) (bVar instanceof Z.b ? null : bVar);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, Long l12) throws IOException {
        cVar.p(l12);
    }
}

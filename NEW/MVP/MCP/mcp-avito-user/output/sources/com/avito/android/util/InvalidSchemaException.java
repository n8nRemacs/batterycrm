package com.avito.android.util;

import com.google.gson.JsonParseException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.InterfaceC42819t;

/* compiled from: InvalidSchemaException.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/InvalidSchemaException;", "Lcom/google/gson/JsonParseException;", "a", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InvalidSchemaException extends JsonParseException {
    private static final long serialVersionUID = 3;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.d<?> f318632b;

    /* compiled from: InvalidSchemaException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/util/InvalidSchemaException$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public InvalidSchemaException(@Y61.k kotlin.reflect.d<?> dVar, @Y61.k String str, @Y61.k String str2) {
        super("Failed to resolve schema at " + ((InterfaceC42819t) dVar).f().getName() + ':' + str + ", reason - " + str2);
        this.f318632b = dVar;
    }
}

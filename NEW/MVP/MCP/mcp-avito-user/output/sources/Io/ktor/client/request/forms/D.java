package io.ktor.client.request.forms;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FormDataContent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/request/forms/D;", "", "a", "b", "Lio/ktor/client/request/forms/D$a;", "Lio/ktor/client/request/forms/D$b;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
abstract class D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final byte[] f399736a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Long f399737b;

    /* compiled from: FormDataContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/request/forms/D$a;", "Lio/ktor/client/request/forms/D;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends D {
    }

    /* compiled from: FormDataContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/request/forms/D$b;", "Lio/ktor/client/request/forms/D;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends D {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.a<io.ktor.utils.io.core.x> f399738c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k byte[] bArr, @Y61.k Y41.a<? extends io.ktor.utils.io.core.x> aVar, @Y61.l Long l12) {
            super(bArr, l12, null);
            this.f399738c = aVar;
        }
    }

    public D(byte[] bArr, Long l12, C42822w c42822w) {
        this.f399736a = bArr;
        this.f399737b = l12;
    }
}

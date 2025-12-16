package com.avito.beduin.v2.interaction.flow.file_picker.flow;

import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.m;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FilePickerInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/i;", "Lcom/avito/beduin/v2/handler/flow/actions/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class i implements com.avito.beduin.v2.handler.flow.actions.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f337410a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> f337411b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> f337412c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<dU0.f> f337413d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.a<dU0.f> f337414e;

    /* compiled from: FilePickerInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/i$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f337415b = new a();

        /* compiled from: FilePickerInteraction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/d;", "it", "LdU0/f;", "invoke", "(Lcom/avito/beduin/v2/engine/field/d;)LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.interaction.flow.file_picker.flow.i$a$a, reason: collision with other inner class name */
        public static final class C10457a extends N implements Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.l f337416l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ z f337417m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10457a(z zVar, com.avito.beduin.v2.engine.field.entity.l lVar) {
                super(1);
                this.f337416l = lVar;
                this.f337417m = zVar;
            }

            @Override // Y41.l
            public final dU0.f invoke(com.avito.beduin.v2.engine.field.d dVar) {
                return this.f337416l.t(this.f337417m.getF336696a().i(), new m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("args", dVar)}));
            }
        }

        /* compiled from: FilePickerInteraction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/d;", "it", "LdU0/f;", "invoke", "(Lcom/avito/beduin/v2/engine/field/d;)LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends N implements Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.l f337418l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ z f337419m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(z zVar, com.avito.beduin.v2.engine.field.entity.l lVar) {
                super(1);
                this.f337418l = lVar;
                this.f337419m = zVar;
            }

            @Override // Y41.l
            public final dU0.f invoke(com.avito.beduin.v2.engine.field.d dVar) {
                com.avito.beduin.v2.engine.field.d dVar2 = dVar;
                com.avito.beduin.v2.engine.field.entity.l lVar = this.f337418l;
                if (lVar != null) {
                    return lVar.t(this.f337419m.getF336696a().i(), new m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("args", dVar2)}));
                }
                return null;
            }
        }

        /* compiled from: FilePickerInteraction.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LdU0/f;", "invoke", "()LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class c extends N implements Y41.a<dU0.f> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.l f337420l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ z f337421m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(z zVar, com.avito.beduin.v2.engine.field.entity.l lVar) {
                super(0);
                this.f337420l = lVar;
                this.f337421m = zVar;
            }

            @Override // Y41.a
            public final dU0.f invoke() {
                com.avito.beduin.v2.engine.field.entity.l lVar = this.f337420l;
                if (lVar == null) {
                    return null;
                }
                z zVarI = this.f337421m.getF336696a().i();
                m.f336868b.getClass();
                return lVar.t(zVarI, m.f336869c);
            }
        }

        public a() {
            super("FilePicker");
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0059 A[Catch: Exception -> 0x0064, TryCatch #1 {Exception -> 0x0064, blocks: (B:30:0x0053, B:32:0x0059, B:34:0x005f, B:39:0x006a, B:56:0x00b0, B:46:0x008a, B:49:0x0093, B:50:0x0099, B:53:0x00a2, B:54:0x00a8, B:57:0x00b6), top: B:75:0x0053, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00bf A[Catch: Exception -> 0x0015, TRY_ENTER, TryCatch #0 {Exception -> 0x0015, blocks: (B:3:0x0002, B:5:0x000a, B:7:0x0010, B:12:0x001b, B:61:0x00bf, B:63:0x00c8, B:64:0x00cd, B:19:0x002f, B:22:0x0038, B:23:0x003c, B:26:0x0045, B:27:0x0049, B:65:0x00ce, B:30:0x0053, B:32:0x0059, B:34:0x005f, B:39:0x006a, B:56:0x00b0, B:46:0x008a, B:49:0x0093, B:50:0x0099, B:53:0x00a2, B:54:0x00a8, B:57:0x00b6), top: B:74:0x0002, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
        @Override // dU0.c
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final dU0.b b(@Y61.k com.avito.beduin.v2.engine.core.z r11, @Y61.k com.avito.beduin.v2.engine.field.m r12) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
            /*
                Method dump skipped, instructions count: 268
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.flow.file_picker.flow.i.a.b(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.m):dU0.b");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@Y61.k l lVar, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar3, @Y61.k Y41.a<dU0.f> aVar, @Y61.l Y41.a<dU0.f> aVar2) {
        this.f337410a = lVar;
        this.f337411b = lVar2;
        this.f337412c = lVar3;
        this.f337413d = aVar;
        this.f337414e = aVar2;
    }

    @Override // com.avito.beduin.v2.handler.flow.actions.b
    @Y61.l
    public final Y41.a<dU0.f> c() {
        return this.f337414e;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f337410a, iVar.f337410a) && L.f(this.f337411b, iVar.f337411b) && L.f(this.f337412c, iVar.f337412c) && L.f(this.f337413d, iVar.f337413d) && L.f(this.f337414e, iVar.f337414e);
    }

    public final int hashCode() {
        int iH2 = r.h((this.f337412c.hashCode() + ((this.f337411b.hashCode() + (this.f337410a.hashCode() * 31)) * 31)) * 31, 31, this.f337413d);
        Y41.a<dU0.f> aVar = this.f337414e;
        return iH2 + (aVar == null ? 0 : aVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilePickerInteraction(pickerType=");
        sb2.append(this.f337410a);
        sb2.append(", onResult=");
        sb2.append(this.f337411b);
        sb2.append(", onError=");
        sb2.append(this.f337412c);
        sb2.append(", onCancel=");
        sb2.append(this.f337413d);
        sb2.append(", onFinalize=");
        return r.v(sb2, this.f337414e, ')');
    }
}

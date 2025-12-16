package ru.cyberity.cbr.presentation.utils;

import Y41.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.sequences.InterfaceC43030m;
import ru.cyberity.cbr.core.common.y0;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.data.source.dynamic.c;

/* compiled from: ApplicantDataFieldUtils.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001at\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2#\u0010\u0010\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/sequences/m;", "Lru/cyberity/cbr/core/data/model/h;", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "strings", "Lru/cyberity/cbr/core/common/y0;", "tinValidator", "Lru/cyberity/cbr/domain/c;", "resources", "", "isStateRequired", "validatePhone", "Lkotlin/Function1;", "", "Lkotlin/S;", "name", "fieldName", "valueForField", "", "Lru/cyberity/cbr/domain/b;", "a", "(Lkotlin/sequences/m;Lru/cyberity/cbr/core/data/source/dynamic/c$c;Lru/cyberity/cbr/core/common/y0;Lru/cyberity/cbr/domain/c;ZLjava/lang/Boolean;LY41/l;)Ljava/util/List;", "cyberity-mobile-sdk-internal_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c {

    /* compiled from: ApplicantDataFieldUtils.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/h;", "item", "Lru/cyberity/cbr/domain/b;", "a", "(Lru/cyberity/cbr/core/data/model/h;)Lru/cyberity/cbr/domain/b;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements l<h, ru.cyberity.cbr.domain.b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<String, String> f435607a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0 f435608b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f435609c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c.C12476c f435610d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f435611e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f435612f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.cbr.domain.c f435613g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f435614h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ h f435615i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f435616j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Boolean f435617k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super String, String> lVar, y0 y0Var, String str, c.C12476c c12476c, h hVar, boolean z12, ru.cyberity.cbr.domain.c cVar, String str2, h hVar2, String str3, Boolean bool) {
            super(1);
            this.f435607a = lVar;
            this.f435608b = y0Var;
            this.f435609c = str;
            this.f435610d = c12476c;
            this.f435611e = hVar;
            this.f435612f = z12;
            this.f435613g = cVar;
            this.f435614h = str2;
            this.f435615i = hVar2;
            this.f435616j = str3;
            this.f435617k = bool;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x012a  */
        @Override // Y41.l
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final ru.cyberity.cbr.domain.b invoke(@Y61.k ru.cyberity.cbr.core.data.model.h r9) {
            /*
                Method dump skipped, instructions count: 367
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.utils.c.a.invoke(ru.cyberity.cbr.core.data.model.h):ru.cyberity.cbr.domain.b");
        }
    }

    public static /* synthetic */ List a(InterfaceC43030m interfaceC43030m, c.C12476c c12476c, y0 y0Var, ru.cyberity.cbr.domain.c cVar, boolean z12, Boolean bool, l lVar, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z12 = false;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            bool = Boolean.FALSE;
        }
        return a(interfaceC43030m, c12476c, y0Var, cVar, z13, bool, lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<ru.cyberity.cbr.domain.b> a(@Y61.k kotlin.sequences.InterfaceC43030m<? extends ru.cyberity.cbr.core.data.model.h> r14, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c.C12476c r15, @Y61.k ru.cyberity.cbr.core.common.y0 r16, @Y61.l ru.cyberity.cbr.domain.c r17, boolean r18, @Y61.l java.lang.Boolean r19, @Y61.k Y41.l<? super java.lang.String, java.lang.String> r20) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.utils.c.a(kotlin.sequences.m, ru.cyberity.cbr.core.data.source.dynamic.c$c, ru.cyberity.cbr.core.common.y0, ru.cyberity.cbr.domain.c, boolean, java.lang.Boolean, Y41.l):java.util.List");
    }
}

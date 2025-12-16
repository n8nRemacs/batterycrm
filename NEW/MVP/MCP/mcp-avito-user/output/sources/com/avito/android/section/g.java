package com.avito.android.section;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SectionItemConverter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.section.SectionItemConverterImpl", f = "SectionItemConverter.kt", i = {1}, l = {160, 178}, m = "convertAllSections", n = {"destination$iv$iv"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Collection f264668q;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f264669r;

    /* renamed from: s, reason: collision with root package name */
    public Collection f264670s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f264671t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f264672u;

    /* renamed from: v, reason: collision with root package name */
    public int f264673v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f264672u = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f264671t = obj;
        this.f264673v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f264672u.a(null, null, this);
    }
}

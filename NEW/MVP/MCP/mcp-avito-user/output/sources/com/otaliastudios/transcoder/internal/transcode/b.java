package com.otaliastudios.transcoder.internal.transcode;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: DefaultTranscodeEngine.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class b extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f366197l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<x11.d> f366198m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(int i12, List<? extends x11.d> list) {
        super(0);
        this.f366197l = i12;
        this.f366198m = list;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.f366197l < C42745f0.J(this.f366198m));
    }
}

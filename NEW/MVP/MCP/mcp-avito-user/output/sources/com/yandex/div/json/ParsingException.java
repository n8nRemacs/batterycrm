package com.yandex.div.json;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ParsingException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/json/ParsingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class ParsingException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ParsingExceptionReason f370541b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.internal.util.g f370542c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f370543d;

    public /* synthetic */ ParsingException(ParsingExceptionReason parsingExceptionReason, String str, Throwable th2, com.yandex.div.internal.util.g gVar, String str2, int i12, C42822w c42822w) {
        this(parsingExceptionReason, str, (i12 & 4) != 0 ? null : th2, (i12 & 8) != 0 ? null : gVar, (i12 & 16) != 0 ? null : str2);
    }

    public ParsingException(@Y61.k ParsingExceptionReason parsingExceptionReason, @Y61.k String str, @Y61.l Throwable th2, @Y61.l com.yandex.div.internal.util.g gVar, @Y61.l String str2) {
        super(str, th2);
        this.f370541b = parsingExceptionReason;
        this.f370542c = gVar;
        this.f370543d = str2;
    }
}

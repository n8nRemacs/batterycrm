package com.avito.beduin.v2.interaction.launch.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LaunchClient.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/launch/flow/ResultStatus;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ResultStatus {

    /* renamed from: c, reason: collision with root package name */
    public static final ResultStatus f337439c;

    /* renamed from: d, reason: collision with root package name */
    public static final ResultStatus f337440d;

    /* renamed from: e, reason: collision with root package name */
    public static final ResultStatus f337441e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ResultStatus[] f337442f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f337443g;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f337444b;

    /* compiled from: LaunchClient.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/launch/flow/ResultStatus$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        ResultStatus resultStatus = new ResultStatus("Success", 0, "success");
        f337439c = resultStatus;
        ResultStatus resultStatus2 = new ResultStatus("Cancel", 1, "cancel");
        f337440d = resultStatus2;
        ResultStatus resultStatus3 = new ResultStatus("Error", 2, "error");
        f337441e = resultStatus3;
        ResultStatus[] resultStatusArr = {resultStatus, resultStatus2, resultStatus3};
        f337442f = resultStatusArr;
        f337443g = kotlin.enums.c.a(resultStatusArr);
        new a(null);
    }

    public ResultStatus(String str, int i12, String str2) {
        this.f337444b = str2;
    }

    public static ResultStatus valueOf(String str) {
        return (ResultStatus) Enum.valueOf(ResultStatus.class, str);
    }

    public static ResultStatus[] values() {
        return (ResultStatus[]) f337442f.clone();
    }
}

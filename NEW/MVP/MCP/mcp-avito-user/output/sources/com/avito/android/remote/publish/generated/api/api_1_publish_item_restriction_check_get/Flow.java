package com.avito.android.remote.publish.generated.api.api_1_publish_item_restriction_check_get;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Api1PublishItemRestrictionCheckGetRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/publish/generated/api/api_1_publish_item_restriction_check_get/Flow;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Add", "Edit", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Flow {

    @c("add")
    public static final Flow Add;

    @c("edit")
    public static final Flow Edit;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Flow[] f254329c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f254330d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f254331b;

    static {
        Flow flow = new Flow("Add", 0, "add");
        Add = flow;
        Flow flow2 = new Flow("Edit", 1, "edit");
        Edit = flow2;
        Flow[] flowArr = {flow, flow2};
        f254329c = flowArr;
        f254330d = kotlin.enums.c.a(flowArr);
    }

    private Flow(String str, int i12, String str2) {
        this.f254331b = str2;
    }

    public static Flow valueOf(String str) {
        return (Flow) Enum.valueOf(Flow.class, str);
    }

    public static Flow[] values() {
        return (Flow[]) f254329c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f254331b.toString();
    }
}

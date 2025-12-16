package com.avito.android.remote.model.model_card;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LinkInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/model_card/LinkInfoVersion;", "", "(Ljava/lang/String;I)V", "V2", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LinkInfoVersion {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LinkInfoVersion[] $VALUES;

    /* renamed from: V2, reason: collision with root package name */
    @c("v2")
    public static final LinkInfoVersion f253890V2 = new LinkInfoVersion("V2", 0);

    private static final /* synthetic */ LinkInfoVersion[] $values() {
        return new LinkInfoVersion[]{f253890V2};
    }

    static {
        LinkInfoVersion[] linkInfoVersionArr$values = $values();
        $VALUES = linkInfoVersionArr$values;
        $ENTRIES = kotlin.enums.c.a(linkInfoVersionArr$values);
    }

    private LinkInfoVersion(String str, int i12) {
    }

    @k
    public static a<LinkInfoVersion> getEntries() {
        return $ENTRIES;
    }

    public static LinkInfoVersion valueOf(String str) {
        return (LinkInfoVersion) Enum.valueOf(LinkInfoVersion.class, str);
    }

    public static LinkInfoVersion[] values() {
        return (LinkInfoVersion[]) $VALUES.clone();
    }
}

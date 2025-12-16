package com.avito.android.publish.details.iac;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IacPermissionRequestSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/iac/IacPermissionRequestSource;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class IacPermissionRequestSource {

    /* renamed from: b, reason: collision with root package name */
    public static final IacPermissionRequestSource f234701b;

    /* renamed from: c, reason: collision with root package name */
    public static final IacPermissionRequestSource f234702c;

    /* renamed from: d, reason: collision with root package name */
    public static final IacPermissionRequestSource f234703d;

    /* renamed from: e, reason: collision with root package name */
    public static final IacPermissionRequestSource f234704e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ IacPermissionRequestSource[] f234705f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f234706g;

    static {
        IacPermissionRequestSource iacPermissionRequestSource = new IacPermissionRequestSource("PUBLISH_VALIDATOR", 0);
        f234701b = iacPermissionRequestSource;
        IacPermissionRequestSource iacPermissionRequestSource2 = new IacPermissionRequestSource("EDIT_BLOCK", 1);
        f234702c = iacPermissionRequestSource2;
        IacPermissionRequestSource iacPermissionRequestSource3 = new IacPermissionRequestSource("PUBLISH_BLOCK", 2);
        f234703d = iacPermissionRequestSource3;
        IacPermissionRequestSource iacPermissionRequestSource4 = new IacPermissionRequestSource("PUBLISH_PERIODIC", 3);
        f234704e = iacPermissionRequestSource4;
        IacPermissionRequestSource[] iacPermissionRequestSourceArr = {iacPermissionRequestSource, iacPermissionRequestSource2, iacPermissionRequestSource3, iacPermissionRequestSource4};
        f234705f = iacPermissionRequestSourceArr;
        f234706g = kotlin.enums.c.a(iacPermissionRequestSourceArr);
    }

    public IacPermissionRequestSource() {
        throw null;
    }

    public static IacPermissionRequestSource valueOf(String str) {
        return (IacPermissionRequestSource) Enum.valueOf(IacPermissionRequestSource.class, str);
    }

    public static IacPermissionRequestSource[] values() {
        return (IacPermissionRequestSource[]) f234705f.clone();
    }
}

package ru;

import Y61.k;
import android.provider.BaseColumns;
import kotlin.Metadata;

/* compiled from: LoginSuggestsContract.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/a;", "Landroid/provider/BaseColumns;", "<init>", "()V", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47726a implements BaseColumns {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f430288a = "SELECT * FROM login_suggests ORDER BY _id DESC";

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f430289b = "SELECT * FROM login_suggests ORDER BY _id DESC LIMIT ?";
}

package com.avito.android.profile_settings_basic.adapter.basic_info;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.AvatarShape;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BasicInfoItemSquareAvatarBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/basic_info/k;", "LTV0/b;", "Lcom/avito/android/profile_settings_basic/adapter/basic_info/m;", "Lcom/avito/android/profile_settings_basic/adapter/basic_info/BasicInfoItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements TV0.b<m, BasicInfoItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f228632a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<s> f228633b = new g.a<>(R.layout.basic_profile_settings_basic_info_square_avatar_item, a.f228634l);

    /* compiled from: BasicInfoItemSquareAvatarBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile_settings_basic/adapter/basic_info/s;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile_settings_basic/adapter/basic_info/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, s> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f228634l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final s invoke(ViewGroup viewGroup, View view) {
            return new s(view);
        }
    }

    @Inject
    public k(@Y61.k c cVar) {
        this.f228632a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f228632a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<s> b() {
        return this.f228633b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof BasicInfoItem) {
            if (((BasicInfoItem) aVar).f228586f == AvatarShape.SQUARE) {
                return true;
            }
        }
        return false;
    }
}

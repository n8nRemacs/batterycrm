package mN0;

import J81.f;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.file_uploader.ValidationRule;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import nN0.C44296a;

/* compiled from: VideoRequirementsApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JF\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LmN0/a;", "", "", "categoryId", "minDuration", "maxDuration", ValidationRule.MAX_FILE_SIZE_RULE, "Lcom/avito/android/remote/model/TypedResult;", "LnN0/a;", "a", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: mN0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC43984a {
    @f("1/video/requirements")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@l @t("categoryId") Long l12, @l @t("minDuration") Long l13, @l @t("maxDuration") Long l14, @l @t(ValidationRule.MAX_FILE_SIZE_RULE) Long l15, @k Continuation<? super TypedResult<C44296a>> continuation);
}

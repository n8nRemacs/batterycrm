package com.avito.android.beduin.common.component.input;

import Y61.l;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.input.k;
import com.avito.android.beduin.common.component.q;
import com.avito.android.beduin.network.model.Constraint;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinInputModel.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010R\u0016\u0010!\u001a\u0004\u0018\u00010\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010R\u0016\u0010'\u001a\u0004\u0018\u00010$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0019R\u0016\u0010+\u001a\u0004\u0018\u00010\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001dR\u0014\u0010,\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/avito/android/beduin/common/component/input/BeduinInputModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin/common/component/q;", "<init>", "()V", "", "getText", "()Ljava/lang/String;", "text", "getDetails", "details", "getPlaceholder", ChannelContext.Item.PLACEHOLDER, "", "Lcom/avito/android/beduin/network/model/Constraint;", "getConstraints", "()Ljava/util/List;", "constraints", "Lcom/avito/android/beduin_models/BeduinAction;", "getOnEndEditingActions", "onEndEditingActions", "getErrorMessage", "errorMessage", "", "getShowErrorMessage", "()Ljava/lang/Boolean;", "showErrorMessage", "", "getTextVersion", "()Ljava/lang/Integer;", "textVersion", "getOnFocusedActions", "onFocusedActions", "isEnabled", "getOnTextChangeActions", "onTextChangeActions", "Lcom/avito/android/beduin/common/component/input/InputIcon;", "getRightIcon", "()Lcom/avito/android/beduin/common/component/input/InputIcon;", "rightIcon", "getShowRightIcon", "showRightIcon", "getMaxLength", "maxLength", "isValid", "()Z", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BeduinInputModel extends LeafBeduinModel implements q {
    public static final int MIN_TEXT_VERSION = Integer.MIN_VALUE;

    @l
    public abstract List<Constraint> getConstraints();

    @l
    public abstract String getDetails();

    @l
    public abstract String getErrorMessage();

    @l
    public abstract Integer getMaxLength();

    @l
    public abstract List<BeduinAction> getOnEndEditingActions();

    @l
    public abstract List<BeduinAction> getOnFocusedActions();

    @l
    public abstract List<BeduinAction> getOnTextChangeActions();

    @l
    public abstract String getPlaceholder();

    @l
    public abstract InputIcon getRightIcon();

    @l
    public abstract Boolean getShowErrorMessage();

    @l
    public abstract Boolean getShowRightIcon();

    @Y61.k
    public abstract String getText();

    @l
    public abstract Integer getTextVersion();

    @l
    public abstract Boolean isEnabled();

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    public boolean isValid() {
        String errorMessage;
        return L.f(j.b(getText(), null, getConstraints()), k.b.f101561a) && ((errorMessage = getErrorMessage()) == null || errorMessage.length() == 0);
    }
}

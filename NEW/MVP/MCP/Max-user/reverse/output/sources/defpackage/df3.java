package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes.dex */
public final /* synthetic */ class df3 implements kw0, sl3, g5a, gu3, pm0, ox7, ubg, InternalIdsResolver.ParticipantPrivateStateModifier, ExternalIdsResolver.ParticipantPrivateStateModifier, om6, pu6, oa8, pa8 {
    public final /* synthetic */ int a;

    public /* synthetic */ df3(int i) {
        this.a = i;
    }

    @Override // defpackage.sl3
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // defpackage.pm0
    public void accept(Object obj, Object obj2) {
    }

    @Override // defpackage.om6, defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 16:
                return Integer.valueOf(((hb4) obj).r);
            case LangUtils.HASH_SEED /* 17 */:
                long j = ((kb4) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            default:
                return wg7.m(Integer.valueOf(((o93) obj).a));
        }
    }

    @Override // defpackage.pu6
    public void d(VideoFrameProcessingException videoFrameProcessingException) {
        a8i.h("DebugViewShaderProgram", "Exception caught by errorListener.", videoFrameProcessingException);
    }

    @Override // defpackage.kw0
    public lw0 e(Bundle bundle) {
        float f;
        int i;
        float f2;
        int i2;
        int i3;
        boolean z;
        switch (this.a) {
            case 0:
                return new ff3(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
            default:
                CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
                CharSequence charSequence2 = charSequence != null ? charSequence : null;
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
                Bitmap bitmap2 = bitmap != null ? bitmap : null;
                if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
                    f = bundle.getFloat(Integer.toString(4, 36));
                    i = bundle.getInt(Integer.toString(5, 36));
                } else {
                    f = -3.4028235E38f;
                    i = Integer.MIN_VALUE;
                }
                int i4 = bundle.containsKey(Integer.toString(6, 36)) ? bundle.getInt(Integer.toString(6, 36)) : Integer.MIN_VALUE;
                float f3 = bundle.containsKey(Integer.toString(7, 36)) ? bundle.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
                int i5 = bundle.containsKey(Integer.toString(8, 36)) ? bundle.getInt(Integer.toString(8, 36)) : Integer.MIN_VALUE;
                if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
                    f2 = bundle.getFloat(Integer.toString(10, 36));
                    i2 = bundle.getInt(Integer.toString(9, 36));
                } else {
                    f2 = -3.4028235E38f;
                    i2 = Integer.MIN_VALUE;
                }
                float f4 = bundle.containsKey(Integer.toString(11, 36)) ? bundle.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
                float f5 = bundle.containsKey(Integer.toString(12, 36)) ? bundle.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
                if (bundle.containsKey(Integer.toString(13, 36))) {
                    i3 = bundle.getInt(Integer.toString(13, 36));
                    z = true;
                } else {
                    i3 = -16777216;
                    z = false;
                }
                int i6 = i3;
                boolean z2 = !bundle.getBoolean(Integer.toString(14, 36), false) ? false : z;
                return new gb4(charSequence2, alignment2, alignment4, bitmap2, f, i, i4, f3, i5, i2, f2, f4, f5, z2, i6, bundle.containsKey(Integer.toString(15, 36)) ? bundle.getInt(Integer.toString(15, 36)) : Integer.MIN_VALUE, bundle.containsKey(Integer.toString(16, 36)) ? bundle.getFloat(Integer.toString(16, 36)) : 0.0f);
        }
    }

    @Override // defpackage.ubg
    public String f() {
        return ConversationFactory.lambda$joinAnonByLink$15();
    }

    @Override // defpackage.oa8
    public void invoke(Object obj) {
        switch (this.a) {
            case 20:
                ((fl5) obj).getClass();
                break;
            case 21:
                ((fl5) obj).getClass();
                break;
            case 22:
                ((fl5) obj).getClass();
                break;
            case 23:
                ((fl5) obj).getClass();
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((jd) obj).getClass();
                break;
            case 25:
                ((fl5) obj).getClass();
                break;
            case 26:
                ((fl5) obj).getClass();
                break;
            case 27:
                ((fl5) obj).getClass();
                break;
            case 28:
                ((fl5) obj).getClass();
                break;
            default:
                ((fl5) obj).getClass();
                break;
        }
    }

    @Override // defpackage.g5a
    public Object p(tm9 tm9Var) {
        return i5j.d(tm9Var);
    }

    @Override // defpackage.ox7
    public Object parse(xx7 xx7Var) {
        switch (this.a) {
            case 8:
                return ConversationFactory.lambda$hangup$21(xx7Var);
            default:
                return ConversationParams.parseCallParams(xx7Var);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.id.ExternalIdsResolver.ParticipantPrivateStateModifier
    public void setExternalId(ConversationParticipant conversationParticipant, ParticipantId participantId) {
        conversationParticipant.setExternalId(participantId);
    }

    @Override // ru.ok.android.externcalls.sdk.id.InternalIdsResolver.ParticipantPrivateStateModifier
    public void setInternalId(ConversationParticipant conversationParticipant, ti1 ti1Var) {
        conversationParticipant.setInternalId(ti1Var);
    }

    @Override // defpackage.gu3
    public void accept(Object obj) throws Throwable {
        switch (this.a) {
            case 3:
                ((rv3) obj).j = 2;
                break;
            case 4:
                wqi.e("ContactController", "changeLastSearchClickTimeAsync: failed", (Throwable) obj);
                break;
            case 5:
                wqi.e("ContactController", "changeLastShowingUnknownContactBar: failed", (Throwable) obj);
                break;
            case 6:
            case 8:
            default:
                ConversationFactory.lambda$hangup$23((Throwable) obj);
                break;
            case 7:
                wqi.e("w14", "asyncUpdate: exception", (Throwable) obj);
                break;
            case 9:
                ConversationFactory.lambda$hangup$22(obj);
                break;
        }
    }
}

package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class zac {
    public static abc a(byte[] bArr) throws ProtoException {
        try {
            Tasks.Profile profile = (Tasks.Profile) fl9.mergeFrom(new Tasks.Profile(), bArr);
            Tasks.Rect rect = profile.crop;
            return new abc(profile.requestId, profile.firstName, profile.lastName, profile.photoToken, profile.photoId, rect != null ? new n10(rect.left, rect.top, rect.right, rect.bottom, 2) : null, profile.description, profile.link, profile.avatarType.equals("PRESET_AVATAR") ? 1 : 2);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
